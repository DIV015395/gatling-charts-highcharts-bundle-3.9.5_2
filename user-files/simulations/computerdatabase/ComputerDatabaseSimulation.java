package computerdatabase;
import static io.gatling.javaapi.core.CoreDsl.*;
import static io.gatling.javaapi.http.HttpDsl.*;
import io.gatling.javaapi.core.*;
import io.gatling.javaapi.http.*;
import scala.Function0;
import scala.collection.Iterator;

import javax.annotation.Nonnull;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.ResourceBundle;
import java.util.function.BiFunction;

public class ComputerDatabaseSimulation extends Simulation
{
    ResourceBundle baseDataBundle = ResourceBundle.getBundle("basedata");
    ResourceBundle deviceIdBundle = ResourceBundle.getBundle("deviceid");
    ResourceBundle userIdBundle = ResourceBundle.getBundle("userid");


    String baseData0 = baseDataBundle.getString("basedata0");
    String deviceId0 = deviceIdBundle.getString("deviceid0");
    String userId0 = userIdBundle.getString("userid0");

    HttpProtocolBuilder httpProtocol0 = http
            .baseUrl("https://chatdv.clovedental.in")
            .wsBaseUrl("wss://chatdv.clovedental.in") // WebSocket URL
            .acceptHeader("text/plain, */*; q=0.01")
            .header("Sec-WebSocket-Version", "13")
            .header("Sec-WebSocket-Extensions", "permessage-deflate; client_max_window_bits; server_max_window_bits=15")
            .header("Sec-WebSocket-Key", "amxpZgVmbHh5bGljeXl2aQ==")
            .header("current_chat_id", "0")
            .header("userId", userId0)
            .header("Connection", "Upgrade")
            .header("authToken", baseData0)
            .header("deviceId", deviceId0)
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

//    String baseData2 = baseDataBundle.getString("basedata2");
//    String deviceId2 = deviceIdBundle.getString("deviceid2");
//    String userId2 = userIdBundle.getString("userid2");
//    HttpProtocolBuilder httpProtocol2 = http
//            .baseUrl("https://chatqa.clovedental.in")
//            .wsBaseUrl("wss://chatqa.clovedental.in") // WebSocket URL
//            .acceptHeader("text/plain, */*; q=0.01")
//            .header("Sec-WebSocket-Version", "13")
//            .header("Sec-WebSocket-Extensions", "permessage-deflate; client_max_window_bits; server_max_window_bits=15")
//            .header("Sec-WebSocket-Key", "amxpZgVmbHh5bGljeXl2aQ==")
//            .header("current_chat_id", "0")
//            .header("userId", userId2)
//            .header("Connection", "Upgrade")
//            .header("authToken", baseData2)
//            .header("deviceId", deviceId2)
//            .header("connected_in", "3")
//            .header("Upgrade", "websocket")
//            .header("Host", "chatqa.clovedental.in:443")
//            .header("Origin", "wss://chatqa.clovedental.in")
//            .header("platform", "iOS");
//    String baseData3 = baseDataBundle.getString("basedata3");
//    String deviceId3 = deviceIdBundle.getString("deviceid3");
//    String userId3 = userIdBundle.getString("userid3");
//    HttpProtocolBuilder httpProtocol3 = http
//            .baseUrl("https://chatqa.clovedental.in")
//            .wsBaseUrl("wss://chatqa.clovedental.in") // WebSocket URL
//            .acceptHeader("text/plain, */*; q=0.01")
//            .header("Sec-WebSocket-Version", "13")
//            .header("Sec-WebSocket-Extensions", "permessage-deflate; client_max_window_bits; server_max_window_bits=15")
//            .header("Sec-WebSocket-Key", "amxpZgVmbHh5bGljeXl2aQ==")
//            .header("current_chat_id", "0")
//            .header("userId", userId3)
//            .header("Connection", "Upgrade")
//            .header("authToken", baseData3)
//            .header("deviceId", deviceId3)
//            .header("connected_in", "4")
//            .header("Upgrade", "websocket")
//            .header("Host", "chatqa.clovedental.in:443")
//            .header("Origin", "wss://chatqa.clovedental.in")
//            .header("platform", "iOS");
//    String baseData4 = baseDataBundle.getString("basedata4");
//    String deviceId4 = deviceIdBundle.getString("deviceid4");
//    String userId4 = userIdBundle.getString("userid4");
//    HttpProtocolBuilder httpProtocol4 = http
//            .baseUrl("https://chatqa.clovedental.in")
//            .wsBaseUrl("wss://chatqa.clovedental.in") // WebSocket URL
//            .acceptHeader("text/plain, */*; q=0.01")
//            .header("Sec-WebSocket-Version", "13")
//            .header("Sec-WebSocket-Extensions", "permessage-deflate; client_max_window_bits; server_max_window_bits=15")
//            .header("Sec-WebSocket-Key", "amxpZgVmbHh5bGljeXl2aQ==")
//            .header("current_chat_id", "0")
//            .header("userId", userId4)
//            .header("Connection", "Upgrade")
//            .header("authToken", baseData4)
//            .header("deviceId", deviceId4)
//            .header("connected_in", "5")
//            .header("Upgrade", "websocket")
//            .header("Host", "chatqa.clovedental.in:443")
//            .header("Origin", "wss://chatqa.clovedental.in")
//            .header("platform", "iOS");
//    String baseData5 = baseDataBundle.getString("basedata5");
//    String deviceId5 = deviceIdBundle.getString("deviceid5");
//    String userId5 = userIdBundle.getString("userid5");
//
//    HttpProtocolBuilder httpProtocol5 = http
//            .baseUrl("https://chatqa.clovedental.in")
//            .wsBaseUrl("wss://chatqa.clovedental.in") // WebSocket URL
//            .acceptHeader("text/plain, */*; q=0.01")
//            .header("Sec-WebSocket-Version", "13")
//            .header("Sec-WebSocket-Extensions", "permessage-deflate; client_max_window_bits; server_max_window_bits=15")
//            .header("Sec-WebSocket-Key", "amxpZgVmbHh5bGljeXl2aQ==")
//            .header("current_chat_id", "0")
//            .header("userId", userId5)
//            .header("Connection", "Upgrade")
//            .header("authToken", baseData5)
//            .header("deviceId", deviceId5)
//            .header("connected_in", "2")
//            .header("Upgrade", "websocket")
//            .header("Host", "chatqa.clovedental.in:443")
//            .header("Origin", "wss://chatdv.clovedental.in")
//            .header("platform", "iOS");

//    String baseDataKey6 = "basedata" + 6;
//    String deviceIdKey6 = "deviceid" + 6;
//    String userIdKey6 = "userid" + 6;
//    String baseData6 = baseDataBundle.getString(baseDataKey6);
//    String deviceId6 = deviceIdBundle.getString(deviceIdKey6);
//    String userId6 = userIdBundle.getString(userIdKey6);
//    HttpProtocolBuilder httpProtocol6 = http
//        .baseUrl("https://chatdv.clovedental.in")
//        .wsBaseUrl("wss://chatdv.clovedental.in") // WebSocket URL
//        .acceptHeader("text/plain, */*; q=0.01")
//        .header("Sec-WebSocket-Version", "13")
//        .header("Sec-WebSocket-Extensions", "permessage-deflate; client_max_window_bits; server_max_window_bits=15")
//        .header("Sec-WebSocket-Key", "amxpZgVmbHh5bGljeXl2aQ==")
//        .header("current_chat_id", "0")
//            .header("Connection", "Upgrade")
//        .header("userId", userId6)
//        .header("authToken", baseData6)
//        .header("deviceId", deviceId6)
//        .header("connected_in", "1")
//        .header("Upgrade", "websocket")
//        .header("Host", "chatdv.clovedental.in:443")
//        .header("Origin", "wss://chatqa.clovedental.in")
//        .header("platform", "iOS");

//  ScenarioBuilder scn0 = scenario("user").exec(ws("WebSocket Connect").connect("/wss2/socket")).pause(120);
  ScenarioBuilder scn1 = scenario("user 2").exec(ws("WebSocket Connect").connect("/wss2/socket")).pause(120);
//   ScenarioBuilder scn2 = scenario("user 3").exec(ws("WebSocket Connect").connect("/wss2/socket")).pause(120);
//
//    ScenarioBuilder scn3 = scenario("user3").exec(ws("WebSocket Connect").connect("/wss2/socket")).pause(120);
//    ScenarioBuilder scn4 = scenario("user4").exec(ws("WebSocket Connect").connect("/wss2/socket")).pause(120);


            {

                setUp(

                        scn1.injectOpen(atOnceUsers(1)).protocols(httpProtocol1)
//                        scn2.injectOpen(atOnceUsers(1)).protocols(httpProtocol2),
//                        scn3.injectOpen(atOnceUsers(1)).protocols(httpProtocol3),
//                        scn4.injectOpen(atOnceUsers(1)).protocols(httpProtocol4)

                );
            }
        }


