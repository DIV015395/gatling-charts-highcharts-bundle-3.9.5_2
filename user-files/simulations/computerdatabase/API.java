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
            .feed(apiData)
            .exec(http("Send API Request")
                    .post("/cometchat_send.php")
                    .headers(Map.of(
                            "X-APP-DEVICE-ID", "${deviceid}",
                            "device_id", "${deviceid}"
                    ))
                    .formParam("file_url", "")
                    .formParam("localmessageid", "${localmessage}")
                    .formParam("msg_type", "10")
                    .formParam("to", "${to}")
                    .formParam("message", "GatlingScript5000")
                    .formParam("basedata", "${basedata}")
                    .check(jsonPath("$.id").saveAs("extractedPayload"))
                    .check(status().is(200)));


    {
        setUp
                (
                        apiScenario.injectOpen(rampUsers(400).during(0)).protocols(httpProtocol)
        );
    }

}

