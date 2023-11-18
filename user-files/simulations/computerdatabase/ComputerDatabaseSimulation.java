package computerdatabase;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import io.gatling.javaapi.core.*;
import io.gatling.javaapi.http.*;

import java.io.IOException;

import static io.gatling.javaapi.core.CoreDsl.*;
import static io.gatling.javaapi.http.HttpDsl.*;

public class ComputerDatabaseSimulation extends Simulation {

    FeederBuilder<String> datas = csv("data (1).csv").circular();

    HttpProtocolBuilder httpProtocol = http
            .baseUrl("https://chatdv.clovedental.in")
            .wsBaseUrl("wss://chatdv.clovedental.in")
            .acceptHeader("text/plain, */*; q=0.01")
            .header("Sec-WebSocket-Version", "13")
            .header("Sec-WebSocket-Extensions", "permessage-deflate; client_max_window_bits; server_max_window_bits=15")
            .header("Sec-WebSocket-Key", "amxpZgVmbHh5bGljeXl2aQ==")
            .header("current_chat_id", "0")
            .header("connected_in", "2")
            .header("Upgrade", "websocket")
            .header("Host", "chatdv.clovedental.in:443")
            .header("platform", "iOS");

    ScenarioBuilder scn = scenario("WebSocket Scenario")
            .feed(datas)
            .exec(ws("Send WebSocket Request")
                    .sendText("{\"requestType\": \"getMessagesOnDemand\"," + "\"}")
                    .await(30)
                    .on(ws.checkTextMessage("responseName").check(jsonPath("$.yourJsonField").saveAs("response")))
            )
            .exec(session -> {
                String jsonResponse = String.valueOf(session("response").as());
                System.out.println("Raw WebSocket Response: " + jsonResponse);
                JsonDeserialize deserializedResponse = session(jsonResponse);
                return session;
            })
            .pause(60);

    private JsonDeserialize session(String response) {
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            return objectMapper.readValue(response, JsonDeserialize.class);
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    {
        setUp(scn.injectOpen(atOnceUsers(1)).protocols(httpProtocol));
    }
}
