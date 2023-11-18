//package computerdatabase;
//import static io.gatling.javaapi.core.CoreDsl.*;
//import static io.gatling.javaapi.http.HttpDsl.*;
//import io.gatling.javaapi.core.*;
//import io.gatling.javaapi.http.*;
//
//
//public class user2 extends Simulation
//{
//
//    FeederBuilder<String> datas = csv("data (1).csv").circular();
//    HttpProtocolBuilder httpProtocol = http
//            .baseUrl("https://chatdv.clovedental.in")
//            .wsBaseUrl("wss://chatdv.clovedental.in")
//            .acceptHeader("text/plain, */*; q=0.01")
//            .header("Sec-WebSocket-Version", "13")
//            .header("Sec-WebSocket-Extensions", "permessage-deflate; client_max_window_bits; server_max_window_bits=15")
//            .header("Sec-WebSocket-Key", "amxpZgVmbHh5bGljeXl2aQ==")
//            .header("current_chat_id", "0")
//            .header("connected_in", "2")
//            .header("Upgrade", "websocket")
//            .header("Host", "chatdv.clovedental.in:443")
//            .header("Origin", "wss://chatdv.clovedental.in")
//            .header("platform", "iOS");
//
//    ScenarioBuilder postApiScenario = scenario("Post API Scenario")
//            .exec(http("Post API Request")
//                    .post("/cometchat_send.php") // Adjust the actual API endpoint
//                    .header("X-APP-OS", "16.6.1")
//                    .header("X-HMAC-FROM", "KEY")
//                    .header("X-APP-DEVICE-ID", "${deviceid}")
//                    .header("X-APP-VERSION", "IOS_v3.2.0")
//                    .header("X-APP-OS-VERSION", "iOS")
//                    .header("Accept", "application/json")
//                    .header("device_id", "${deviceid}")
//                    .header("Content-Type", "application/x-www-form-urlencoded")
//                    .formParam("file_url", "")
//                    .formParam("localmessageid", "endedednd")
//                    .formParam("msg_type", "10")
//                    .formParam("to", "${to}")
//                    .formParam("message", "Hii everyone kaya hal chal hai bhai")
//                    .formParam("basedata", "${basedata}");
//
//    ScenarioBuilder websocketScenario = scenario("WebSocket Scenario")
//            .exec(ws("WebSocket Connect")
//                    .connect("/wss2/socket")
//                    .header("userId", "${userid}")
//                    .header("deviceId", "${deviceid}")
//                    .header("authToken", "${basedata}"))
//            .pause(200);
//
//    {
//        setUp(
//                postApiScenario.injectOpen(atOnceUsers(1)),
//                websocketScenario.injectOpen(atOnceUsers(1))
//        ).protocols(httpProtocol);
//    }
//
//
//}
//
//
//
//
//
