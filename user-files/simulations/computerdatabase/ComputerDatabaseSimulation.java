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
            .pause(10);
//            .exec(ws("Send Request type in Websocket")
//                    .sendText("{\"requestType\": \"getMessagesOnDemand\"}")).pause(5);
    {
        setUp
                (
                        scn.injectOpen(atOnceUsers(120)).protocols(httpProtocol)
                );
    }
}

