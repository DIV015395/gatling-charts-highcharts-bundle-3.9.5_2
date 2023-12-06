package computerdatabase;
import io.gatling.javaapi.core.*;
import io.gatling.javaapi.http.*;
import static io.gatling.javaapi.core.CoreDsl.*;
import static io.gatling.javaapi.http.HttpDsl.*;

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
                    .formParam("localmessageid", "${localMessageId}")
                    .formParam("msg_type", "10")
                    .formParam("to", "${to}")
                    .formParam("message", "Gatling Script")
                    .formParam("basedata", "${basedata}").check(status().is(200)));


    {
        setUp
                (
                        apiScenario.injectOpen(rampUsers(1).during(1)).protocols(httpProtocol)
//                        apiScenario.injectOpen(atOnceUsers(2)).protocols(httpProtocol)
        );
    }
}

