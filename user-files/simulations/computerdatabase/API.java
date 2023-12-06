package computerdatabase;
import io.gatling.core.session.package$;
import io.gatling.javaapi.core.*;
import io.gatling.javaapi.http.*;
import static io.gatling.javaapi.core.CoreDsl.*;
import static io.gatling.javaapi.http.HttpDsl.*;

import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.Map;

public class API extends Simulation {

    FeederBuilder<String> apiData = csv("data (2).csv").circular();
    HttpProtocolBuilder httpProtocol = http
            .baseUrl("https://chatdv.clovedental.in")
            .header("X-APP-OS", "16.6.1")
            .header("X-HMAC-FROM", "KEY")
            .header("X-APP-VERSION", "IOS_v3.2.0")
            .header("X-APP-OS-VERSION", "iOS")
            .header("Accept", "application/json") //Fixed Header
            .header("Content-Type", "application/x-www-form-urlencoded");// header Complete


    ScenarioBuilder apiScenario = scenario("API Scenario")
            .feed(apiData).exec(http("Send API Request")
                    .post("/cometchat_send.php")
                    .headers(Map.of(
                            "X-APP-DEVICE-ID", "${deviceid}",
                            "device_id", "${deviceid}"
                    ))
                    .formParam("file_url", "")
                    .formParam("localmessageid", "${localMessageId}")
                    .formParam("msg_type", "10")
                    .formParam("to", "${to}")
                    .formParam("message", "Gatling Script500")
                    .formParam("basedata", "${basedata}")
                    .transformResponse((response, session) -> {
                        if (response.status().code() == 200) {
                            return new io.gatling.http.response.Response(
                                    response.request(),
                                    response.startTimestamp(),
                                    response.endTimestamp(),
                                    response.status(),
                                    response.headers(),
                                    new io.gatling.http.response.ByteArrayResponseBody(Base64.getDecoder().decode(response.body().string()), StandardCharsets.UTF_8),
                                    response.checksums(),
                                    response.isHttp2()
                            );
                        } else {
                            return response;
                        }
                    }
            ));


    {
        setUp
                (
                        apiScenario.injectOpen(rampUsers(1).during(1)).protocols(httpProtocol)
//                        apiScenario.injectOpen(atOnceUsers(2)).protocols(httpProtocol)
        );
    }
}

