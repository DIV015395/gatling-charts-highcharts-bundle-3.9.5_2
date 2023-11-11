package computerdatabase;

import io.gatling.javaapi.core.*;
import io.gatling.javaapi.http.*;
import static io.gatling.javaapi.core.CoreDsl.*;
import static io.gatling.javaapi.http.HttpDsl.*;

public class ComputerDatabaseSimulation extends Simulation {

    FeederBuilder<String> datas = csv("data (1).csv").circular();

    HttpProtocolBuilder httpProtocol = http
            .baseUrl("https://chatdv.clovedental.in") // Correct HTTPS base URL
            .wsBaseUrl("wss://chatdv.clovedental.in") // WebSocket URL
            .acceptHeader("text/plain, */*; q=0.01")
            .header("Sec-WebSocket-Version", "13")
            .header("Sec-WebSocket-Extensions", "permessage-deflate; client_max_window_bits; server_max_window_bits=15")
            .header("Sec-WebSocket-Key", "amxpZgVmbHh5bGljeXl2aQ==")
            .header("current_chat_id", "0")
            .header("connected_in", "2")
            .header("Upgrade", "websocket")
            .header("Host", "chatdv.clovedental.in:443")
            .header("Origin", "wss://chatdv.clovedental.in")
            .header("platform", "iOS");

    ScenarioBuilder scn = scenario("WebSocket Scenario")
            .feed(datas)  // Use 'feed' to inject data from the feeder
            .exec(ws("WebSocket Connect")
                    .connect("/wss2/socket")
                    .header("userId", "${userid}")
                    .header("deviceId", "${deviceid}")
                    .header("authToken", "${basedata}"))
            .pause(200);

    {
        setUp(

                scn.injectOpen(atOnceUsers(1)).protocols(httpProtocol)
        );
    }
}




//    ScenarioBuilder scn = scenario("WebSocket and HTTP Scenario")
//            .feed(datas)  // Use 'feed' to inject data from the feeder
//            .exec(ws("WebSocket Connect")
//                    .connect("/wss2/socket")
//                    .header("userId", "${userid}")
//                    .header("deviceId", "${deviceid}")
//                    .header("authToken", "${basedata}")
//            )
//            .pause(5) // Adjust the duration as needed
//            .exec(http("HTTP Request")
//                    .post("/cometchat_send.php")
//                    .formParam("authToken", "${basedata}")
//                    .formParam("file_url", "")
//                    .formParam("localmessageid", "34848584")
//                    .formParam("msg_type", "10")
//                    .formParam("to", "12")
//                    .formParam("message", "hello")
//            )
//            .pause(120); // Adjust the duration as needed


