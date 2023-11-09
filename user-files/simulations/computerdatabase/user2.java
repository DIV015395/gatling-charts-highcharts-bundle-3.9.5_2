package computerdatabase;
import static io.gatling.javaapi.core.CoreDsl.*;
import static io.gatling.javaapi.http.HttpDsl.*;
import io.gatling.javaapi.core.*;
import io.gatling.javaapi.http.*;
import scala.Function0;
import scala.collection.Iterator;

import javax.annotation.Nonnull;
import java.time.Duration;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.ResourceBundle;
import java.util.function.BiFunction;

public class user2 extends Simulation
{
//    private static final String CSV_FILE_PATH = "path/to/user_data.csv";
//
//    // Other existing code...
//    FeederBuilder<Object> userData = csv(CSV_FILE_PATH).circular;
//     FeederBuilder<String> datas = csv("data (1).csv").circular();

    ResourceBundle baseDataBundle = ResourceBundle.getBundle("basedata");
    ResourceBundle deviceIdBundle = ResourceBundle.getBundle("deviceid");
    ResourceBundle userIdBundle = ResourceBundle.getBundle("userid");


    String baseData2 = baseDataBundle.getString("basedata2");
    String deviceId2 = deviceIdBundle.getString("deviceid2");
    String userId2 = userIdBundle.getString("userid2");

    HttpProtocolBuilder httpProtocol2 = http
            .baseUrl("https://chatdv.clovedental.in")
            .wsBaseUrl("wss://chatdv.clovedental.in") // WebSocket URL
            .acceptHeader("text/plain, */*; q=0.01")
            .header("Sec-WebSocket-Version", "13")
            .header("Sec-WebSocket-Extensions", "permessage-deflate; client_max_window_bits; server_max_window_bits=15")
            .header("Sec-WebSocket-Key", "amxpZgVmbHh5bGljeXl2aQ==")
            .header("current_chat_id", "0")
            .header("userId", userId2)
            .header("Connection", "Upgrade")
            .header("authToken", baseData2)
            .header("deviceId", deviceId2)
            .header("connected_in", "1")
            .header("Upgrade", "websocket")
            .header("Host", "chatdv.clovedental.in:443")
            .header("Origin", "wss://chatdv.clovedental.in")
            .header("platform", "iOS");

    String baseData1 = baseDataBundle.getString("basedata1");
    String deviceId1 = deviceIdBundle.getString("deviceid1");
    String userId1 = userIdBundle.getString("userid1");
    HttpProtocolBuilder httpProtocol1 = http
            .baseUrl("https://chatdv.clovedental.in")
            .wsBaseUrl("wss://chatdv.clovedental.in") // WebSocket URL
            .acceptHeader("text/plain, */*; q=0.01")
            .header("Sec-WebSocket-Version", "13")
            .header("Sec-WebSocket-Extensions", "permessage-deflate; client_max_window_bits; server_max_window_bits=15")
            .header("Sec-WebSocket-Key", "amxpZgVmbHh5bGljeXl2aQ==")
            .header("current_chat_id", "0")
            .header("userId", userId1)
            .header("Connection", "Upgrade")
            .header("authToken", baseData1)
            .header("deviceId", deviceId1)
            .header("connected_in", "2")
            .header("Upgrade", "websocket")
            .header("Host", "chatdv.clovedental.in:443")
            .header("Origin", "wss://chatdv.clovedental.in")
            .header("platform", "iOS");

//
//    ScenarioBuilder scn = scenario("WebSocket Scenario")
//            .exec(ws("WebSocket Connect")
//                    .connect("/wss2/socket")
//                    .header("userId", "${userId}")
//                    .header("deviceId", "${deviceId}")
//                    .header("authToken", "${baseData}"))
//            .pause(120);


//
//    ScenarioBuilder scn1 = scenario("WebSocket Scenario")
//            .feed(datas)  // Use 'feed' to inject data from the feeder
//            .exec(ws("WebSocket Connect")
//                    .connect("/wss2/socket")
//                    .header("userId", "${userId}")
//                    .header("deviceId", "${deviceId}")
//                    .header("authToken", "${baseData}"))
//            .pause(120);



    ScenarioBuilder scn1 = scenario("user 2").exec(ws("WebSocket Connect").connect("/wss2/socket")).pause(120);

    ScenarioBuilder scn2 = scenario("user 1").exec(ws("WebSocket Connect").connect("/wss2/socket")).pause(120);





    {

        setUp(

                scn1.injectOpen(atOnceUsers(1)).protocols(httpProtocol1),
                scn2.injectOpen(atOnceUsers(1)).protocols(httpProtocol2)

        );
    }




}



