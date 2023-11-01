package computerdatabase;
import static io.gatling.javaapi.core.CoreDsl.*;
import static io.gatling.javaapi.http.HttpDsl.*;
import io.gatling.javaapi.core.*;
import io.gatling.javaapi.http.*;

import java.util.ResourceBundle;

public class ComputerDatabaseSimulation extends Simulation
{
    ResourceBundle baseDataBundle = ResourceBundle.getBundle("basedata");
    ResourceBundle deviceIdBundle = ResourceBundle.getBundle("deviceid");
    ResourceBundle userIdBundle = ResourceBundle.getBundle("userid");







    String baseData0 = baseDataBundle.getString("basedata0");
    String deviceId0 = deviceIdBundle.getString("deviceid0");
    String userId0 = userIdBundle.getString("userid0");
    HttpProtocolBuilder httpProtocol0 = http
            .baseUrl("https://chatqa.clovedental.in")
            .wsBaseUrl("wss://chatqa.clovedental.in") // WebSocket URL
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
            .header("Host", "chatqa.clovedental.in:443")
            .header("Origin", "wss://chatqa.clovedental.in")
            .header("platform", "iOS");

    String baseData1 = baseDataBundle.getString("basedata1");
    String deviceId1 = deviceIdBundle.getString("deviceid1");
    String userId1 = userIdBundle.getString("userid1");
    HttpProtocolBuilder httpProtocol1 = http
            .baseUrl("https://chatqa.clovedental.in")
            .wsBaseUrl("wss://chatqa.clovedental.in") // WebSocket URL
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
            .header("Host", "chatqa.clovedental.in:443")
            .header("Origin", "wss://chatqa.clovedental.in")
            .header("platform", "iOS");
    String baseData2 = baseDataBundle.getString("basedata2");
    String deviceId2 = deviceIdBundle.getString("deviceid2");
    String userId2 = userIdBundle.getString("userid2");
    HttpProtocolBuilder httpProtocol2 = http
            .baseUrl("https://chatqa.clovedental.in")
            .wsBaseUrl("wss://chatqa.clovedental.in") // WebSocket URL
            .acceptHeader("text/plain, */*; q=0.01")
            .header("Sec-WebSocket-Version", "13")
            .header("Sec-WebSocket-Extensions", "permessage-deflate; client_max_window_bits; server_max_window_bits=15")
            .header("Sec-WebSocket-Key", "amxpZgVmbHh5bGljeXl2aQ==")
            .header("current_chat_id", "0")
            .header("userId", userId2)
            .header("Connection", "Upgrade")
            .header("authToken", baseData2)
            .header("deviceId", deviceId2)
            .header("connected_in", "3")
            .header("Upgrade", "websocket")
            .header("Host", "chatqa.clovedental.in:443")
            .header("Origin", "wss://chatqa.clovedental.in")
            .header("platform", "iOS");
    String baseData3 = baseDataBundle.getString("basedata3");
    String deviceId3 = deviceIdBundle.getString("deviceid3");
    String userId3 = userIdBundle.getString("userid3");
    HttpProtocolBuilder httpProtocol3 = http
            .baseUrl("https://chatqa.clovedental.in")
            .wsBaseUrl("wss://chatqa.clovedental.in") // WebSocket URL
            .acceptHeader("text/plain, */*; q=0.01")
            .header("Sec-WebSocket-Version", "13")
            .header("Sec-WebSocket-Extensions", "permessage-deflate; client_max_window_bits; server_max_window_bits=15")
            .header("Sec-WebSocket-Key", "amxpZgVmbHh5bGljeXl2aQ==")
            .header("current_chat_id", "0")
            .header("userId", userId3)
            .header("Connection", "Upgrade")
            .header("authToken", baseData3)
            .header("deviceId", deviceId3)
            .header("connected_in", "4")
            .header("Upgrade", "websocket")
            .header("Host", "chatqa.clovedental.in:443")
            .header("Origin", "wss://chatqa.clovedental.in")
            .header("platform", "iOS");
    String baseData4 = baseDataBundle.getString("basedata4");
    String deviceId4 = deviceIdBundle.getString("deviceid4");
    String userId4 = userIdBundle.getString("userid4");
    HttpProtocolBuilder httpProtocol4 = http
            .baseUrl("https://chatqa.clovedental.in")
            .wsBaseUrl("wss://chatqa.clovedental.in") // WebSocket URL
            .acceptHeader("text/plain, */*; q=0.01")
            .header("Sec-WebSocket-Version", "13")
            .header("Sec-WebSocket-Extensions", "permessage-deflate; client_max_window_bits; server_max_window_bits=15")
            .header("Sec-WebSocket-Key", "amxpZgVmbHh5bGljeXl2aQ==")
            .header("current_chat_id", "0")
            .header("userId", userId4)
            .header("Connection", "Upgrade")
            .header("authToken", baseData4)
            .header("deviceId", deviceId4)
            .header("connected_in", "5")
            .header("Upgrade", "websocket")
            .header("Host", "chatqa.clovedental.in:443")
            .header("Origin", "wss://chatqa.clovedental.in")
            .header("platform", "iOS");
    String baseData5 = baseDataBundle.getString("basedata5");
    String deviceId5 = deviceIdBundle.getString("deviceid5");
    String userId5 = userIdBundle.getString("userid5");

    HttpProtocolBuilder httpProtocol5 = http
            .baseUrl("https://chatqa.clovedental.in")
            .wsBaseUrl("wss://chatqa.clovedental.in") // WebSocket URL
            .acceptHeader("text/plain, */*; q=0.01")
            .header("Sec-WebSocket-Version", "13")
            .header("Sec-WebSocket-Extensions", "permessage-deflate; client_max_window_bits; server_max_window_bits=15")
            .header("Sec-WebSocket-Key", "amxpZgVmbHh5bGljeXl2aQ==")
            .header("current_chat_id", "0")
            .header("userId", userId5)
            .header("Connection", "Upgrade")
            .header("authToken", baseData5)
            .header("deviceId", deviceId5)
            .header("connected_in", "2")
            .header("Upgrade", "websocket")
            .header("Host", "chatqa.clovedental.in:443")
            .header("Origin", "wss://chatqa.clovedental.in")
            .header("platform", "iOS");

    String baseDataKey6 = "basedata" + 6;
    String deviceIdKey6 = "deviceid" + 6;
    String userIdKey6 = "userid" + 6;
    String baseData6 = baseDataBundle.getString(baseDataKey6);
    String deviceId6 = deviceIdBundle.getString(deviceIdKey6);
    String userId6 = userIdBundle.getString(userIdKey6);
    HttpProtocolBuilder httpProtocol6 = http
        .baseUrl("https://chatqa.clovedental.in")
        .wsBaseUrl("wss://chatqa.clovedental.in") // WebSocket URL
        .acceptHeader("text/plain, */*; q=0.01")
        .header("Sec-WebSocket-Version", "13")
        .header("Sec-WebSocket-Extensions", "permessage-deflate; client_max_window_bits; server_max_window_bits=15")
        .header("Sec-WebSocket-Key", "amxpZgVmbHh5bGljeXl2aQ==")
        .header("current_chat_id", "0")
        .header("userId", userId6)
        .header("Connection", "Upgrade")
        .header("authToken", baseData6)
        .header("deviceId", deviceId6)
        .header("connected_in", "1")
        .header("Upgrade", "websocket")
        .header("Host", "chatqa.clovedental.in:443")
        .header("Origin", "wss://chatqa.clovedental.in")
        .header("platform", "iOS");
    HttpProtocolBuilder httpProtocol7 = http
            .baseUrl("https://chatqa.clovedental.in")
            .wsBaseUrl("wss://chatqa.clovedental.in") // WebSocket URL
            .acceptHeader("text/plain, */*; q=0.01")
            .header("Sec-WebSocket-Version", "13")
            .header("Sec-WebSocket-Extensions", "permessage-deflate; client_max_window_bits; server_max_window_bits=15")
            .header("Sec-WebSocket-Key", "amxpZgVmbHh5bGljeXl2aQ==")
            .header("current_chat_id", "0")
            .header("userId", "12")
            .header("Connection", "Upgrade")
            .header("authToken", "DOs7Obj9VySGBQeizido4SB%2Bvab36ffTiwMNBWH4%2FHE%3D")
            .header("deviceId", "2")
            .header("connected_in", "2")
            .header("Upgrade", "websocket")
            .header("Host", "chatqa.clovedental.in:443")
            .header("Origin", "wss://chatqa.clovedental.in")
            .header("platform", "iOS");




    HttpProtocolBuilder httpProtocol8 = http
        .baseUrl("https://chatqa.clovedental.in")
        .wsBaseUrl("wss://chatqa.clovedental.in") // WebSocket URL
        .acceptHeader("text/plain, */*; q=0.01")
        .header("Sec-WebSocket-Version", "13")
        .header("Sec-WebSocket-Extensions", "permessage-deflate; client_max_window_bits; server_max_window_bits=15")
        .header("Sec-WebSocket-Key", "amxpZgVmbHh5bGljeXl2aQ==")
        .header("current_chat_id", "0")
        .header("userId", "14")
        .header("Connection", "Upgrade")
        .header("authToken", "W3WNF%2BGgnXSGZV%2Bp8uJFKLzVqk3dJs5s2cCpjVe0Yzk%3D")
        .header("deviceId", "1")
        .header("connected_in", "1")
        .header("Upgrade", "websocket")
        .header("Host", "chatqa.clovedental.in:443")
        .header("Origin", "wss://chatqa.clovedental.in")
        .header("platform", "iOS");

    HttpProtocolBuilder httpProtocol9 = http
            .baseUrl("https://chatqa.clovedental.in")
            .wsBaseUrl("wss://chatqa.clovedental.in") // WebSocket URL
            .acceptHeader("text/plain, */*; q=0.01")
            .header("Sec-WebSocket-Version", "13")
            .header("Sec-WebSocket-Extensions", "permessage-deflate; client_max_window_bits; server_max_window_bits=15")
            .header("Sec-WebSocket-Key", "amxpZgVmbHh5bGljeXl2aQ==")
            .header("current_chat_id", "0")
            .header("userId", "12")
            .header("Connection", "Upgrade")
            .header("authToken", "DOs7Obj9VySGBQeizido4SB%2Bvab36ffTiwMNBWH4%2FHE%3D")
            .header("deviceId", "2")
            .header("connected_in", "2")
            .header("Upgrade", "websocket")
            .header("Host", "chatqa.clovedental.in:443")
            .header("Origin", "wss://chatqa.clovedental.in")
            .header("platform", "iOS");



    HttpProtocolBuilder httpProtocol10 = http
            .baseUrl("https://chatqa.clovedental.in")
            .wsBaseUrl("wss://chatqa.clovedental.in") // WebSocket URL
            .acceptHeader("text/plain, */*; q=0.01")
            .header("Sec-WebSocket-Version", "13")
            .header("Sec-WebSocket-Extensions", "permessage-deflate; client_max_window_bits; server_max_window_bits=15")
            .header("Sec-WebSocket-Key", "amxpZgVmbHh5bGljeXl2aQ==")
            .header("current_chat_id", "0")
            .header("userId", "15")
            .header("Connection", "Upgrade")
            .header("authToken", "N4S0cYkVJOViUWa5Oqqa%2Bi5l%2FsJhZa7H4%2Fu5e5OgGow%3D")
            .header("deviceId", "3")
            .header("connected_in", "2")
            .header("Upgrade", "websocket")
            .header("Host", "chatqa.clovedental.in:443")
            .header("Origin", "wss://chatqa.clovedental.in")
            .header("platform", "iOS");
    HttpProtocolBuilder httpProtocol11 = http
        .baseUrl("https://chatqa.clovedental.in")
        .wsBaseUrl("wss://chatqa.clovedental.in") // WebSocket URL
        .acceptHeader("text/plain, */*; q=0.01")
        .header("Sec-WebSocket-Version", "13")
        .header("Sec-WebSocket-Extensions", "permessage-deflate; client_max_window_bits; server_max_window_bits=15")
        .header("Sec-WebSocket-Key", "amxpZgVmbHh5bGljeXl2aQ==")
        .header("current_chat_id", "0")
        .header("userId", "14")
        .header("Connection", "Upgrade")
        .header("authToken", "W3WNF%2BGgnXSGZV%2Bp8uJFKLzVqk3dJs5s2cCpjVe0Yzk%3D")
        .header("deviceId", "1")
        .header("connected_in", "1")
        .header("Upgrade", "websocket")
        .header("Host", "chatqa.clovedental.in:443")
        .header("Origin", "wss://chatqa.clovedental.in")
        .header("platform", "iOS");
    HttpProtocolBuilder httpProtocol12 = http
            .baseUrl("https://chatqa.clovedental.in")
            .wsBaseUrl("wss://chatqa.clovedental.in") // WebSocket URL
            .acceptHeader("text/plain, */*; q=0.01")
            .header("Sec-WebSocket-Version", "13")
            .header("Sec-WebSocket-Extensions", "permessage-deflate; client_max_window_bits; server_max_window_bits=15")
            .header("Sec-WebSocket-Key", "amxpZgVmbHh5bGljeXl2aQ==")
            .header("current_chat_id", "0")
            .header("userId", "12")
            .header("Connection", "Upgrade")
            .header("authToken", "DOs7Obj9VySGBQeizido4SB%2Bvab36ffTiwMNBWH4%2FHE%3D")
            .header("deviceId", "2")
            .header("connected_in", "2")
            .header("Upgrade", "websocket")
            .header("Host", "chatqa.clovedental.in:443")
            .header("Origin", "wss://chatqa.clovedental.in")
            .header("platform", "iOS");



    HttpProtocolBuilder httpProtocol13 = http
            .baseUrl("https://chatqa.clovedental.in")
            .wsBaseUrl("wss://chatqa.clovedental.in") // WebSocket URL
            .acceptHeader("text/plain, */*; q=0.01")
            .header("Sec-WebSocket-Version", "13")
            .header("Sec-WebSocket-Extensions", "permessage-deflate; client_max_window_bits; server_max_window_bits=15")
            .header("Sec-WebSocket-Key", "amxpZgVmbHh5bGljeXl2aQ==")
            .header("current_chat_id", "0")
            .header("userId", "15")
            .header("Connection", "Upgrade")
            .header("authToken", "N4S0cYkVJOViUWa5Oqqa%2Bi5l%2FsJhZa7H4%2Fu5e5OgGow%3D")
            .header("deviceId", "3")
            .header("connected_in", "2")
            .header("Upgrade", "websocket")
            .header("Host", "chatqa.clovedental.in:443")
            .header("Origin", "wss://chatqa.clovedental.in")
            .header("platform", "iOS");


    HttpProtocolBuilder httpProtocol14 = http
            .baseUrl("https://chatqa.clovedental.in")
            .wsBaseUrl("wss://chatqa.clovedental.in") // WebSocket URL
            .acceptHeader("text/plain, */*; q=0.01")
            .header("Sec-WebSocket-Version", "13")
            .header("Sec-WebSocket-Extensions", "permessage-deflate; client_max_window_bits; server_max_window_bits=15")
            .header("Sec-WebSocket-Key", "amxpZgVmbHh5bGljeXl2aQ==")
            .header("current_chat_id", "0")
            .header("userId", "15")
            .header("Connection", "Upgrade")
            .header("authToken", "N4S0cYkVJOViUWa5Oqqa%2Bi5l%2FsJhZa7H4%2Fu5e5OgGow%3D")
            .header("deviceId", "3")
            .header("connected_in", "2")
            .header("Upgrade", "websocket")
            .header("Host", "chatqa.clovedental.in:443")
            .header("Origin", "wss://chatqa.clovedental.in")
            .header("platform", "iOS");
    HttpProtocolBuilder httpProtocol15 = http
        .baseUrl("https://chatqa.clovedental.in")
        .wsBaseUrl("wss://chatqa.clovedental.in") // WebSocket URL
        .acceptHeader("text/plain, */*; q=0.01")
        .header("Sec-WebSocket-Version", "13")
        .header("Sec-WebSocket-Extensions", "permessage-deflate; client_max_window_bits; server_max_window_bits=15")
        .header("Sec-WebSocket-Key", "amxpZgVmbHh5bGljeXl2aQ==")
        .header("current_chat_id", "0")
        .header("userId", "14")
        .header("Connection", "Upgrade")
        .header("authToken", "W3WNF%2BGgnXSGZV%2Bp8uJFKLzVqk3dJs5s2cCpjVe0Yzk%3D")
        .header("deviceId", "1")
        .header("connected_in", "1")
        .header("Upgrade", "websocket")
        .header("Host", "chatqa.clovedental.in:443")
        .header("Origin", "wss://chatqa.clovedental.in")
        .header("platform", "iOS");
    HttpProtocolBuilder httpProtocol16 = http
            .baseUrl("https://chatqa.clovedental.in")
            .wsBaseUrl("wss://chatqa.clovedental.in") // WebSocket URL
            .acceptHeader("text/plain, */*; q=0.01")
            .header("Sec-WebSocket-Version", "13")
            .header("Sec-WebSocket-Extensions", "permessage-deflate; client_max_window_bits; server_max_window_bits=15")
            .header("Sec-WebSocket-Key", "amxpZgVmbHh5bGljeXl2aQ==")
            .header("current_chat_id", "0")
            .header("userId", "12")
            .header("Connection", "Upgrade")
            .header("authToken", "DOs7Obj9VySGBQeizido4SB%2Bvab36ffTiwMNBWH4%2FHE%3D")
            .header("deviceId", "2")
            .header("connected_in", "2")
            .header("Upgrade", "websocket")
            .header("Host", "chatqa.clovedental.in:443")
            .header("Origin", "wss://chatqa.clovedental.in")
            .header("platform", "iOS");



    HttpProtocolBuilder httpProtocol17 = http
            .baseUrl("https://chatqa.clovedental.in")
            .wsBaseUrl("wss://chatqa.clovedental.in") // WebSocket URL
            .acceptHeader("text/plain, */*; q=0.01")
            .header("Sec-WebSocket-Version", "13")
            .header("Sec-WebSocket-Extensions", "permessage-deflate; client_max_window_bits; server_max_window_bits=15")
            .header("Sec-WebSocket-Key", "amxpZgVmbHh5bGljeXl2aQ==")
            .header("current_chat_id", "0")
            .header("userId", "15")
            .header("Connection", "Upgrade")
            .header("authToken", "N4S0cYkVJOViUWa5Oqqa%2Bi5l%2FsJhZa7H4%2Fu5e5OgGow%3D")
            .header("deviceId", "3")
            .header("connected_in", "2")
            .header("Upgrade", "websocket")
            .header("Host", "chatqa.clovedental.in:443")
            .header("Origin", "wss://chatqa.clovedental.in")
            .header("platform", "iOS");
    HttpProtocolBuilder httpProtocol18 = http
        .baseUrl("https://chatqa.clovedental.in")
        .wsBaseUrl("wss://chatqa.clovedental.in") // WebSocket URL
        .acceptHeader("text/plain, */*; q=0.01")
        .header("Sec-WebSocket-Version", "13")
        .header("Sec-WebSocket-Extensions", "permessage-deflate; client_max_window_bits; server_max_window_bits=15")
        .header("Sec-WebSocket-Key", "amxpZgVmbHh5bGljeXl2aQ==")
        .header("current_chat_id", "0")
        .header("userId", "14")
        .header("Connection", "Upgrade")
        .header("authToken", "W3WNF%2BGgnXSGZV%2Bp8uJFKLzVqk3dJs5s2cCpjVe0Yzk%3D")
        .header("deviceId", "1")
        .header("connected_in", "1")
        .header("Upgrade", "websocket")
        .header("Host", "chatqa.clovedental.in:443")
        .header("Origin", "wss://chatqa.clovedental.in")
        .header("platform", "iOS");
    HttpProtocolBuilder httpProtocol19 = http
            .baseUrl("https://chatqa.clovedental.in")
            .wsBaseUrl("wss://chatqa.clovedental.in") // WebSocket URL
            .acceptHeader("text/plain, */*; q=0.01")
            .header("Sec-WebSocket-Version", "13")
            .header("Sec-WebSocket-Extensions", "permessage-deflate; client_max_window_bits; server_max_window_bits=15")
            .header("Sec-WebSocket-Key", "amxpZgVmbHh5bGljeXl2aQ==")
            .header("current_chat_id", "0")
            .header("userId", "12")
            .header("Connection", "Upgrade")
            .header("authToken", "DOs7Obj9VySGBQeizido4SB%2Bvab36ffTiwMNBWH4%2FHE%3D")
            .header("deviceId", "2")
            .header("connected_in", "2")
            .header("Upgrade", "websocket")
            .header("Host", "chatqa.clovedental.in:443")
            .header("Origin", "wss://chatqa.clovedental.in")
            .header("platform", "iOS");



    HttpProtocolBuilder httpProtocol20 = http
            .baseUrl("https://chatqa.clovedental.in")
            .wsBaseUrl("wss://chatqa.clovedental.in") // WebSocket URL
            .acceptHeader("text/plain, */*; q=0.01")
            .header("Sec-WebSocket-Version", "13")
            .header("Sec-WebSocket-Extensions", "permessage-deflate; client_max_window_bits; server_max_window_bits=15")
            .header("Sec-WebSocket-Key", "amxpZgVmbHh5bGljeXl2aQ==")
            .header("current_chat_id", "0")
            .header("userId", "15")
            .header("Connection", "Upgrade")
            .header("authToken", "N4S0cYkVJOViUWa5Oqqa%2Bi5l%2FsJhZa7H4%2Fu5e5OgGow%3D")
            .header("deviceId", "3")
            .header("connected_in", "2")
            .header("Upgrade", "websocket")
            .header("Host", "chatqa.clovedental.in:443")
            .header("Origin", "wss://chatqa.clovedental.in")
            .header("platform", "iOS");
    HttpProtocolBuilder httpProtocol21 = http
        .baseUrl("https://chatqa.clovedental.in")
        .wsBaseUrl("wss://chatqa.clovedental.in") // WebSocket URL
        .acceptHeader("text/plain, */*; q=0.01")
        .header("Sec-WebSocket-Version", "13")
        .header("Sec-WebSocket-Extensions", "permessage-deflate; client_max_window_bits; server_max_window_bits=15")
        .header("Sec-WebSocket-Key", "amxpZgVmbHh5bGljeXl2aQ==")
        .header("current_chat_id", "0")
        .header("userId", "14")
        .header("Connection", "Upgrade")
        .header("authToken", "W3WNF%2BGgnXSGZV%2Bp8uJFKLzVqk3dJs5s2cCpjVe0Yzk%3D")
        .header("deviceId", "1")
        .header("connected_in", "1")
        .header("Upgrade", "websocket")
        .header("Host", "chatqa.clovedental.in:443")
        .header("Origin", "wss://chatqa.clovedental.in")
        .header("platform", "iOS");
    HttpProtocolBuilder httpProtocol22 = http
            .baseUrl("https://chatqa.clovedental.in")
            .wsBaseUrl("wss://chatqa.clovedental.in") // WebSocket URL
            .acceptHeader("text/plain, */*; q=0.01")
            .header("Sec-WebSocket-Version", "13")
            .header("Sec-WebSocket-Extensions", "permessage-deflate; client_max_window_bits; server_max_window_bits=15")
            .header("Sec-WebSocket-Key", "amxpZgVmbHh5bGljeXl2aQ==")
            .header("current_chat_id", "0")
            .header("userId", "12")
            .header("Connection", "Upgrade")
            .header("authToken", "DOs7Obj9VySGBQeizido4SB%2Bvab36ffTiwMNBWH4%2FHE%3D")
            .header("deviceId", "2")
            .header("connected_in", "2")
            .header("Upgrade", "websocket")
            .header("Host", "chatqa.clovedental.in:443")
            .header("Origin", "wss://chatqa.clovedental.in")
            .header("platform", "iOS");



    HttpProtocolBuilder httpProtocol23 = http
            .baseUrl("https://chatqa.clovedental.in")
            .wsBaseUrl("wss://chatqa.clovedental.in") // WebSocket URL
            .acceptHeader("text/plain, */*; q=0.01")
            .header("Sec-WebSocket-Version", "13")
            .header("Sec-WebSocket-Extensions", "permessage-deflate; client_max_window_bits; server_max_window_bits=15")
            .header("Sec-WebSocket-Key", "amxpZgVmbHh5bGljeXl2aQ==")
            .header("current_chat_id", "0")
            .header("userId", "15")
            .header("Connection", "Upgrade")
            .header("authToken", "N4S0cYkVJOViUWa5Oqqa%2Bi5l%2FsJhZa7H4%2Fu5e5OgGow%3D")
            .header("deviceId", "3")
            .header("connected_in", "2")
            .header("Upgrade", "websocket")
            .header("Host", "chatqa.clovedental.in:443")
            .header("Origin", "wss://chatqa.clovedental.in")
            .header("platform", "iOS");
    HttpProtocolBuilder httpProtocol24 = http
        .baseUrl("https://chatqa.clovedental.in")
        .wsBaseUrl("wss://chatqa.clovedental.in") // WebSocket URL
        .acceptHeader("text/plain, */*; q=0.01")
        .header("Sec-WebSocket-Version", "13")
        .header("Sec-WebSocket-Extensions", "permessage-deflate; client_max_window_bits; server_max_window_bits=15")
        .header("Sec-WebSocket-Key", "amxpZgVmbHh5bGljeXl2aQ==")
        .header("current_chat_id", "0")
        .header("userId", "14")
        .header("Connection", "Upgrade")
        .header("authToken", "W3WNF%2BGgnXSGZV%2Bp8uJFKLzVqk3dJs5s2cCpjVe0Yzk%3D")
        .header("deviceId", "1")
        .header("connected_in", "1")
        .header("Upgrade", "websocket")
        .header("Host", "chatqa.clovedental.in:443")
        .header("Origin", "wss://chatqa.clovedental.in")
        .header("platform", "iOS");
    HttpProtocolBuilder httpProtocol125 = http
            .baseUrl("https://chatqa.clovedental.in")
            .wsBaseUrl("wss://chatqa.clovedental.in") // WebSocket URL
            .acceptHeader("text/plain, */*; q=0.01")
            .header("Sec-WebSocket-Version", "13")
            .header("Sec-WebSocket-Extensions", "permessage-deflate; client_max_window_bits; server_max_window_bits=15")
            .header("Sec-WebSocket-Key", "amxpZgVmbHh5bGljeXl2aQ==")
            .header("current_chat_id", "0")
            .header("userId", "12")
            .header("Connection", "Upgrade")
            .header("authToken", "DOs7Obj9VySGBQeizido4SB%2Bvab36ffTiwMNBWH4%2FHE%3D")
            .header("deviceId", "2")
            .header("connected_in", "2")
            .header("Upgrade", "websocket")
            .header("Host", "chatqa.clovedental.in:443")
            .header("Origin", "wss://chatqa.clovedental.in")
            .header("platform", "iOS");



    HttpProtocolBuilder httpProtocol26 = http
            .baseUrl("https://chatqa.clovedental.in")
            .wsBaseUrl("wss://chatqa.clovedental.in") // WebSocket URL
            .acceptHeader("text/plain, */*; q=0.01")
            .header("Sec-WebSocket-Version", "13")
            .header("Sec-WebSocket-Extensions", "permessage-deflate; client_max_window_bits; server_max_window_bits=15")
            .header("Sec-WebSocket-Key", "amxpZgVmbHh5bGljeXl2aQ==")
            .header("current_chat_id", "0")
            .header("userId", "15")
            .header("Connection", "Upgrade")
            .header("authToken", "N4S0cYkVJOViUWa5Oqqa%2Bi5l%2FsJhZa7H4%2Fu5e5OgGow%3D")
            .header("deviceId", "3")
            .header("connected_in", "2")
            .header("Upgrade", "websocket")
            .header("Host", "chatqa.clovedental.in:443")
            .header("Origin", "wss://chatqa.clovedental.in")
            .header("platform", "iOS");
    HttpProtocolBuilder httpProtocol27 = http
        .baseUrl("https://chatqa.clovedental.in")
        .wsBaseUrl("wss://chatqa.clovedental.in") // WebSocket URL
        .acceptHeader("text/plain, */*; q=0.01")
        .header("Sec-WebSocket-Version", "13")
        .header("Sec-WebSocket-Extensions", "permessage-deflate; client_max_window_bits; server_max_window_bits=15")
        .header("Sec-WebSocket-Key", "amxpZgVmbHh5bGljeXl2aQ==")
        .header("current_chat_id", "0")
        .header("userId", "14")
        .header("Connection", "Upgrade")
        .header("authToken", "W3WNF%2BGgnXSGZV%2Bp8uJFKLzVqk3dJs5s2cCpjVe0Yzk%3D")
        .header("deviceId", "1")
        .header("connected_in", "1")
        .header("Upgrade", "websocket")
        .header("Host", "chatqa.clovedental.in:443")
        .header("Origin", "wss://chatqa.clovedental.in")
        .header("platform", "iOS");
    HttpProtocolBuilder httpProtocol28 = http
            .baseUrl("https://chatqa.clovedental.in")
            .wsBaseUrl("wss://chatqa.clovedental.in") // WebSocket URL
            .acceptHeader("text/plain, */*; q=0.01")
            .header("Sec-WebSocket-Version", "13")
            .header("Sec-WebSocket-Extensions", "permessage-deflate; client_max_window_bits; server_max_window_bits=15")
            .header("Sec-WebSocket-Key", "amxpZgVmbHh5bGljeXl2aQ==")
            .header("current_chat_id", "0")
            .header("userId", "12")
            .header("Connection", "Upgrade")
            .header("authToken", "DOs7Obj9VySGBQeizido4SB%2Bvab36ffTiwMNBWH4%2FHE%3D")
            .header("deviceId", "2")
            .header("connected_in", "2")
            .header("Upgrade", "websocket")
            .header("Host", "chatqa.clovedental.in:443")
            .header("Origin", "wss://chatqa.clovedental.in")
            .header("platform", "iOS");



    HttpProtocolBuilder httpProtocol29 = http
            .baseUrl("https://chatqa.clovedental.in")
            .wsBaseUrl("wss://chatqa.clovedental.in") // WebSocket URL
            .acceptHeader("text/plain, */*; q=0.01")
            .header("Sec-WebSocket-Version", "13")
            .header("Sec-WebSocket-Extensions", "permessage-deflate; client_max_window_bits; server_max_window_bits=15")
            .header("Sec-WebSocket-Key", "amxpZgVmbHh5bGljeXl2aQ==")
            .header("current_chat_id", "0")
            .header("userId", "15")
            .header("Connection", "Upgrade")
            .header("authToken", "N4S0cYkVJOViUWa5Oqqa%2Bi5l%2FsJhZa7H4%2Fu5e5OgGow%3D")
            .header("deviceId", "3")
            .header("connected_in", "2")
            .header("Upgrade", "websocket")
            .header("Host", "chatqa.clovedental.in:443")
            .header("Origin", "wss://chatqa.clovedental.in")
            .header("platform", "iOS");
    HttpProtocolBuilder httpProtocol30 = http
        .baseUrl("https://chatqa.clovedental.in")
        .wsBaseUrl("wss://chatqa.clovedental.in") // WebSocket URL
        .acceptHeader("text/plain, */*; q=0.01")
        .header("Sec-WebSocket-Version", "13")
        .header("Sec-WebSocket-Extensions", "permessage-deflate; client_max_window_bits; server_max_window_bits=15")
        .header("Sec-WebSocket-Key", "amxpZgVmbHh5bGljeXl2aQ==")
        .header("current_chat_id", "0")
        .header("userId", "14")
        .header("Connection", "Upgrade")
        .header("authToken", "W3WNF%2BGgnXSGZV%2Bp8uJFKLzVqk3dJs5s2cCpjVe0Yzk%3D")
        .header("deviceId", "1")
        .header("connected_in", "1")
        .header("Upgrade", "websocket")
        .header("Host", "chatqa.clovedental.in:443")
        .header("Origin", "wss://chatqa.clovedental.in")
        .header("platform", "iOS");
    HttpProtocolBuilder httpProtocol31 = http
            .baseUrl("https://chatqa.clovedental.in")
            .wsBaseUrl("wss://chatqa.clovedental.in") // WebSocket URL
            .acceptHeader("text/plain, */*; q=0.01")
            .header("Sec-WebSocket-Version", "13")
            .header("Sec-WebSocket-Extensions", "permessage-deflate; client_max_window_bits; server_max_window_bits=15")
            .header("Sec-WebSocket-Key", "amxpZgVmbHh5bGljeXl2aQ==")
            .header("current_chat_id", "0")
            .header("userId", "12")
            .header("Connection", "Upgrade")
            .header("authToken", "DOs7Obj9VySGBQeizido4SB%2Bvab36ffTiwMNBWH4%2FHE%3D")
            .header("deviceId", "2")
            .header("connected_in", "2")
            .header("Upgrade", "websocket")
            .header("Host", "chatqa.clovedental.in:443")
            .header("Origin", "wss://chatqa.clovedental.in")
            .header("platform", "iOS");



    HttpProtocolBuilder httpProtocol32 = http
            .baseUrl("https://chatqa.clovedental.in")
            .wsBaseUrl("wss://chatqa.clovedental.in") // WebSocket URL
            .acceptHeader("text/plain, */*; q=0.01")
            .header("Sec-WebSocket-Version", "13")
            .header("Sec-WebSocket-Extensions", "permessage-deflate; client_max_window_bits; server_max_window_bits=15")
            .header("Sec-WebSocket-Key", "amxpZgVmbHh5bGljeXl2aQ==")
            .header("current_chat_id", "0")
            .header("userId", "15")
            .header("Connection", "Upgrade")
            .header("authToken", "N4S0cYkVJOViUWa5Oqqa%2Bi5l%2FsJhZa7H4%2Fu5e5OgGow%3D")
            .header("deviceId", "3")
            .header("connected_in", "2")
            .header("Upgrade", "websocket")
            .header("Host", "chatqa.clovedental.in:443")
            .header("Origin", "wss://chatqa.clovedental.in")
            .header("platform", "iOS");
    HttpProtocolBuilder httpProtocol33 = http
        .baseUrl("https://chatqa.clovedental.in")
        .wsBaseUrl("wss://chatqa.clovedental.in") // WebSocket URL
        .acceptHeader("text/plain, */*; q=0.01")
        .header("Sec-WebSocket-Version", "13")
        .header("Sec-WebSocket-Extensions", "permessage-deflate; client_max_window_bits; server_max_window_bits=15")
        .header("Sec-WebSocket-Key", "amxpZgVmbHh5bGljeXl2aQ==")
        .header("current_chat_id", "0")
        .header("userId", "14")
        .header("Connection", "Upgrade")
        .header("authToken", "W3WNF%2BGgnXSGZV%2Bp8uJFKLzVqk3dJs5s2cCpjVe0Yzk%3D")
        .header("deviceId", "1")
        .header("connected_in", "1")
        .header("Upgrade", "websocket")
        .header("Host", "chatqa.clovedental.in:443")
        .header("Origin", "wss://chatqa.clovedental.in")
        .header("platform", "iOS");
    HttpProtocolBuilder httpProtocol134 = http
            .baseUrl("https://chatqa.clovedental.in")
            .wsBaseUrl("wss://chatqa.clovedental.in") // WebSocket URL
            .acceptHeader("text/plain, */*; q=0.01")
            .header("Sec-WebSocket-Version", "13")
            .header("Sec-WebSocket-Extensions", "permessage-deflate; client_max_window_bits; server_max_window_bits=15")
            .header("Sec-WebSocket-Key", "amxpZgVmbHh5bGljeXl2aQ==")
            .header("current_chat_id", "0")
            .header("userId", "12")
            .header("Connection", "Upgrade")
            .header("authToken", "DOs7Obj9VySGBQeizido4SB%2Bvab36ffTiwMNBWH4%2FHE%3D")
            .header("deviceId", "2")
            .header("connected_in", "2")
            .header("Upgrade", "websocket")
            .header("Host", "chatqa.clovedental.in:443")
            .header("Origin", "wss://chatqa.clovedental.in")
            .header("platform", "iOS");



    HttpProtocolBuilder httpProtocol35 = http
            .baseUrl("https://chatqa.clovedental.in")
            .wsBaseUrl("wss://chatqa.clovedental.in") // WebSocket URL
            .acceptHeader("text/plain, */*; q=0.01")
            .header("Sec-WebSocket-Version", "13")
            .header("Sec-WebSocket-Extensions", "permessage-deflate; client_max_window_bits; server_max_window_bits=15")
            .header("Sec-WebSocket-Key", "amxpZgVmbHh5bGljeXl2aQ==")
            .header("current_chat_id", "0")
            .header("userId", "15")
            .header("Connection", "Upgrade")
            .header("authToken", "N4S0cYkVJOViUWa5Oqqa%2Bi5l%2FsJhZa7H4%2Fu5e5OgGow%3D")
            .header("deviceId", "3")
            .header("connected_in", "2")
            .header("Upgrade", "websocket")
            .header("Host", "chatqa.clovedental.in:443")
            .header("Origin", "wss://chatqa.clovedental.in")
            .header("platform", "iOS");
    HttpProtocolBuilder httpProtocol36 = http
        .baseUrl("https://chatqa.clovedental.in")
        .wsBaseUrl("wss://chatqa.clovedental.in") // WebSocket URL
        .acceptHeader("text/plain, */*; q=0.01")
        .header("Sec-WebSocket-Version", "13")
        .header("Sec-WebSocket-Extensions", "permessage-deflate; client_max_window_bits; server_max_window_bits=15")
        .header("Sec-WebSocket-Key", "amxpZgVmbHh5bGljeXl2aQ==")
        .header("current_chat_id", "0")
        .header("userId", "14")
        .header("Connection", "Upgrade")
        .header("authToken", "W3WNF%2BGgnXSGZV%2Bp8uJFKLzVqk3dJs5s2cCpjVe0Yzk%3D")
        .header("deviceId", "1")
        .header("connected_in", "1")
        .header("Upgrade", "websocket")
        .header("Host", "chatqa.clovedental.in:443")
        .header("Origin", "wss://chatqa.clovedental.in")
        .header("platform", "iOS");
    HttpProtocolBuilder httpProtocol37 = http
            .baseUrl("https://chatqa.clovedental.in")
            .wsBaseUrl("wss://chatqa.clovedental.in") // WebSocket URL
            .acceptHeader("text/plain, */*; q=0.01")
            .header("Sec-WebSocket-Version", "13")
            .header("Sec-WebSocket-Extensions", "permessage-deflate; client_max_window_bits; server_max_window_bits=15")
            .header("Sec-WebSocket-Key", "amxpZgVmbHh5bGljeXl2aQ==")
            .header("current_chat_id", "0")
            .header("userId", "12")
            .header("Connection", "Upgrade")
            .header("authToken", "DOs7Obj9VySGBQeizido4SB%2Bvab36ffTiwMNBWH4%2FHE%3D")
            .header("deviceId", "2")
            .header("connected_in", "2")
            .header("Upgrade", "websocket")
            .header("Host", "chatqa.clovedental.in:443")
            .header("Origin", "wss://chatqa.clovedental.in")
            .header("platform", "iOS");



    HttpProtocolBuilder httpProtocol38 = http
            .baseUrl("https://chatqa.clovedental.in")
            .wsBaseUrl("wss://chatqa.clovedental.in") // WebSocket URL
            .acceptHeader("text/plain, */*; q=0.01")
            .header("Sec-WebSocket-Version", "13")
            .header("Sec-WebSocket-Extensions", "permessage-deflate; client_max_window_bits; server_max_window_bits=15")
            .header("Sec-WebSocket-Key", "amxpZgVmbHh5bGljeXl2aQ==")
            .header("current_chat_id", "0")
            .header("userId", "15")
            .header("Connection", "Upgrade")
            .header("authToken", "N4S0cYkVJOViUWa5Oqqa%2Bi5l%2FsJhZa7H4%2Fu5e5OgGow%3D")
            .header("deviceId", "3")
            .header("connected_in", "2")
            .header("Upgrade", "websocket")
            .header("Host", "chatqa.clovedental.in:443")
            .header("Origin", "wss://chatqa.clovedental.in")
            .header("platform", "iOS");
    HttpProtocolBuilder httpProtocol39 = http
        .baseUrl("https://chatqa.clovedental.in")
        .wsBaseUrl("wss://chatqa.clovedental.in") // WebSocket URL
        .acceptHeader("text/plain, */*; q=0.01")
        .header("Sec-WebSocket-Version", "13")
        .header("Sec-WebSocket-Extensions", "permessage-deflate; client_max_window_bits; server_max_window_bits=15")
        .header("Sec-WebSocket-Key", "amxpZgVmbHh5bGljeXl2aQ==")
        .header("current_chat_id", "0")
        .header("userId", "14")
        .header("Connection", "Upgrade")
        .header("authToken", "W3WNF%2BGgnXSGZV%2Bp8uJFKLzVqk3dJs5s2cCpjVe0Yzk%3D")
        .header("deviceId", "1")
        .header("connected_in", "1")
        .header("Upgrade", "websocket")
        .header("Host", "chatqa.clovedental.in:443")
        .header("Origin", "wss://chatqa.clovedental.in")
        .header("platform", "iOS");
    HttpProtocolBuilder httpProtocol40 = http
            .baseUrl("https://chatqa.clovedental.in")
            .wsBaseUrl("wss://chatqa.clovedental.in") // WebSocket URL
            .acceptHeader("text/plain, */*; q=0.01")
            .header("Sec-WebSocket-Version", "13")
            .header("Sec-WebSocket-Extensions", "permessage-deflate; client_max_window_bits; server_max_window_bits=15")
            .header("Sec-WebSocket-Key", "amxpZgVmbHh5bGljeXl2aQ==")
            .header("current_chat_id", "0")
            .header("userId", "12")
            .header("Connection", "Upgrade")
            .header("authToken", "DOs7Obj9VySGBQeizido4SB%2Bvab36ffTiwMNBWH4%2FHE%3D")
            .header("deviceId", "2")
            .header("connected_in", "2")
            .header("Upgrade", "websocket")
            .header("Host", "chatqa.clovedental.in:443")
            .header("Origin", "wss://chatqa.clovedental.in")
            .header("platform", "iOS");



    HttpProtocolBuilder httpProtocol41 = http
            .baseUrl("https://chatqa.clovedental.in")
            .wsBaseUrl("wss://chatqa.clovedental.in") // WebSocket URL
            .acceptHeader("text/plain, */*; q=0.01")
            .header("Sec-WebSocket-Version", "13")
            .header("Sec-WebSocket-Extensions", "permessage-deflate; client_max_window_bits; server_max_window_bits=15")
            .header("Sec-WebSocket-Key", "amxpZgVmbHh5bGljeXl2aQ==")
            .header("current_chat_id", "0")
            .header("userId", "15")
            .header("Connection", "Upgrade")
            .header("authToken", "N4S0cYkVJOViUWa5Oqqa%2Bi5l%2FsJhZa7H4%2Fu5e5OgGow%3D")
            .header("deviceId", "3")
            .header("connected_in", "2")
            .header("Upgrade", "websocket")
            .header("Host", "chatqa.clovedental.in:443")
            .header("Origin", "wss://chatqa.clovedental.in")
            .header("platform", "iOS");
    HttpProtocolBuilder httpProtocol42 = http
        .baseUrl("https://chatqa.clovedental.in")
        .wsBaseUrl("wss://chatqa.clovedental.in") // WebSocket URL
        .acceptHeader("text/plain, */*; q=0.01")
        .header("Sec-WebSocket-Version", "13")
        .header("Sec-WebSocket-Extensions", "permessage-deflate; client_max_window_bits; server_max_window_bits=15")
        .header("Sec-WebSocket-Key", "amxpZgVmbHh5bGljeXl2aQ==")
        .header("current_chat_id", "0")
        .header("userId", "14")
        .header("Connection", "Upgrade")
        .header("authToken", "W3WNF%2BGgnXSGZV%2Bp8uJFKLzVqk3dJs5s2cCpjVe0Yzk%3D")
        .header("deviceId", "1")
        .header("connected_in", "1")
        .header("Upgrade", "websocket")
        .header("Host", "chatqa.clovedental.in:443")
        .header("Origin", "wss://chatqa.clovedental.in")
        .header("platform", "iOS");
    HttpProtocolBuilder httpProtocol43 = http
            .baseUrl("https://chatqa.clovedental.in")
            .wsBaseUrl("wss://chatqa.clovedental.in") // WebSocket URL
            .acceptHeader("text/plain, */*; q=0.01")
            .header("Sec-WebSocket-Version", "13")
            .header("Sec-WebSocket-Extensions", "permessage-deflate; client_max_window_bits; server_max_window_bits=15")
            .header("Sec-WebSocket-Key", "amxpZgVmbHh5bGljeXl2aQ==")
            .header("current_chat_id", "0")
            .header("userId", "12")
            .header("Connection", "Upgrade")
            .header("authToken", "DOs7Obj9VySGBQeizido4SB%2Bvab36ffTiwMNBWH4%2FHE%3D")
            .header("deviceId", "2")
            .header("connected_in", "2")
            .header("Upgrade", "websocket")
            .header("Host", "chatqa.clovedental.in:443")
            .header("Origin", "wss://chatqa.clovedental.in")
            .header("platform", "iOS");



    HttpProtocolBuilder httpProtocol44 = http
            .baseUrl("https://chatqa.clovedental.in")
            .wsBaseUrl("wss://chatqa.clovedental.in") // WebSocket URL
            .acceptHeader("text/plain, */*; q=0.01")
            .header("Sec-WebSocket-Version", "13")
            .header("Sec-WebSocket-Extensions", "permessage-deflate; client_max_window_bits; server_max_window_bits=15")
            .header("Sec-WebSocket-Key", "amxpZgVmbHh5bGljeXl2aQ==")
            .header("current_chat_id", "0")
            .header("userId", "15")
            .header("Connection", "Upgrade")
            .header("authToken", "N4S0cYkVJOViUWa5Oqqa%2Bi5l%2FsJhZa7H4%2Fu5e5OgGow%3D")
            .header("deviceId", "3")
            .header("connected_in", "2")
            .header("Upgrade", "websocket")
            .header("Host", "chatqa.clovedental.in:443")
            .header("Origin", "wss://chatqa.clovedental.in")
            .header("platform", "iOS");
    HttpProtocolBuilder httpProtocol45 = http
        .baseUrl("https://chatqa.clovedental.in")
        .wsBaseUrl("wss://chatqa.clovedental.in") // WebSocket URL
        .acceptHeader("text/plain, */*; q=0.01")
        .header("Sec-WebSocket-Version", "13")
        .header("Sec-WebSocket-Extensions", "permessage-deflate; client_max_window_bits; server_max_window_bits=15")
        .header("Sec-WebSocket-Key", "amxpZgVmbHh5bGljeXl2aQ==")
        .header("current_chat_id", "0")
        .header("userId", "14")
        .header("Connection", "Upgrade")
        .header("authToken", "W3WNF%2BGgnXSGZV%2Bp8uJFKLzVqk3dJs5s2cCpjVe0Yzk%3D")
        .header("deviceId", "1")
        .header("connected_in", "1")
        .header("Upgrade", "websocket")
        .header("Host", "chatqa.clovedental.in:443")
        .header("Origin", "wss://chatqa.clovedental.in")
        .header("platform", "iOS");
    HttpProtocolBuilder httpProtocol46 = http
            .baseUrl("https://chatqa.clovedental.in")
            .wsBaseUrl("wss://chatqa.clovedental.in") // WebSocket URL
            .acceptHeader("text/plain, */*; q=0.01")
            .header("Sec-WebSocket-Version", "13")
            .header("Sec-WebSocket-Extensions", "permessage-deflate; client_max_window_bits; server_max_window_bits=15")
            .header("Sec-WebSocket-Key", "amxpZgVmbHh5bGljeXl2aQ==")
            .header("current_chat_id", "0")
            .header("userId", "12")
            .header("Connection", "Upgrade")
            .header("authToken", "DOs7Obj9VySGBQeizido4SB%2Bvab36ffTiwMNBWH4%2FHE%3D")
            .header("deviceId", "2")
            .header("connected_in", "2")
            .header("Upgrade", "websocket")
            .header("Host", "chatqa.clovedental.in:443")
            .header("Origin", "wss://chatqa.clovedental.in")
            .header("platform", "iOS");



    HttpProtocolBuilder httpProtocol47 = http
            .baseUrl("https://chatqa.clovedental.in")
            .wsBaseUrl("wss://chatqa.clovedental.in") // WebSocket URL
            .acceptHeader("text/plain, */*; q=0.01")
            .header("Sec-WebSocket-Version", "13")
            .header("Sec-WebSocket-Extensions", "permessage-deflate; client_max_window_bits; server_max_window_bits=15")
            .header("Sec-WebSocket-Key", "amxpZgVmbHh5bGljeXl2aQ==")
            .header("current_chat_id", "0")
            .header("userId", "15")
            .header("Connection", "Upgrade")
            .header("authToken", "N4S0cYkVJOViUWa5Oqqa%2Bi5l%2FsJhZa7H4%2Fu5e5OgGow%3D")
            .header("deviceId", "3")
            .header("connected_in", "2")
            .header("Upgrade", "websocket")
            .header("Host", "chatqa.clovedental.in:443")
            .header("Origin", "wss://chatqa.clovedental.in")
            .header("platform", "iOS");
    HttpProtocolBuilder httpProtocol48 = http
        .baseUrl("https://chatqa.clovedental.in")
        .wsBaseUrl("wss://chatqa.clovedental.in") // WebSocket URL
        .acceptHeader("text/plain, */*; q=0.01")
        .header("Sec-WebSocket-Version", "13")
        .header("Sec-WebSocket-Extensions", "permessage-deflate; client_max_window_bits; server_max_window_bits=15")
        .header("Sec-WebSocket-Key", "amxpZgVmbHh5bGljeXl2aQ==")
        .header("current_chat_id", "0")
        .header("userId", "14")
        .header("Connection", "Upgrade")
        .header("authToken", "W3WNF%2BGgnXSGZV%2Bp8uJFKLzVqk3dJs5s2cCpjVe0Yzk%3D")
        .header("deviceId", "1")
        .header("connected_in", "1")
        .header("Upgrade", "websocket")
        .header("Host", "chatqa.clovedental.in:443")
        .header("Origin", "wss://chatqa.clovedental.in")
        .header("platform", "iOS");
    HttpProtocolBuilder httpProtocol49 = http
            .baseUrl("https://chatqa.clovedental.in")
            .wsBaseUrl("wss://chatqa.clovedental.in") // WebSocket URL
            .acceptHeader("text/plain, */*; q=0.01")
            .header("Sec-WebSocket-Version", "13")
            .header("Sec-WebSocket-Extensions", "permessage-deflate; client_max_window_bits; server_max_window_bits=15")
            .header("Sec-WebSocket-Key", "amxpZgVmbHh5bGljeXl2aQ==")
            .header("current_chat_id", "0")
            .header("userId", "12")
            .header("Connection", "Upgrade")
            .header("authToken", "DOs7Obj9VySGBQeizido4SB%2Bvab36ffTiwMNBWH4%2FHE%3D")
            .header("deviceId", "2")
            .header("connected_in", "2")
            .header("Upgrade", "websocket")
            .header("Host", "chatqa.clovedental.in:443")
            .header("Origin", "wss://chatqa.clovedental.in")
            .header("platform", "iOS");



    HttpProtocolBuilder httpProtocol50 = http
            .baseUrl("https://chatqa.clovedental.in")
            .wsBaseUrl("wss://chatqa.clovedental.in") // WebSocket URL
            .acceptHeader("text/plain, */*; q=0.01")
            .header("Sec-WebSocket-Version", "13")
            .header("Sec-WebSocket-Extensions", "permessage-deflate; client_max_window_bits; server_max_window_bits=15")
            .header("Sec-WebSocket-Key", "amxpZgVmbHh5bGljeXl2aQ==")
            .header("current_chat_id", "0")
            .header("userId", "15")
            .header("Connection", "Upgrade")
            .header("authToken", "N4S0cYkVJOViUWa5Oqqa%2Bi5l%2FsJhZa7H4%2Fu5e5OgGow%3D")
            .header("deviceId", "3")
            .header("connected_in", "2")
            .header("Upgrade", "websocket")
            .header("Host", "chatqa.clovedental.in:443")
            .header("Origin", "wss://chatqa.clovedental.in")
            .header("platform", "iOS");
    HttpProtocolBuilder httpProtocol51 = http
        .baseUrl("https://chatqa.clovedental.in")
        .wsBaseUrl("wss://chatqa.clovedental.in") // WebSocket URL
        .acceptHeader("text/plain, */*; q=0.01")
        .header("Sec-WebSocket-Version", "13")
        .header("Sec-WebSocket-Extensions", "permessage-deflate; client_max_window_bits; server_max_window_bits=15")
        .header("Sec-WebSocket-Key", "amxpZgVmbHh5bGljeXl2aQ==")
        .header("current_chat_id", "0")
        .header("userId", "14")
        .header("Connection", "Upgrade")
        .header("authToken", "W3WNF%2BGgnXSGZV%2Bp8uJFKLzVqk3dJs5s2cCpjVe0Yzk%3D")
        .header("deviceId", "1")
        .header("connected_in", "1")
        .header("Upgrade", "websocket")
        .header("Host", "chatqa.clovedental.in:443")
        .header("Origin", "wss://chatqa.clovedental.in")
        .header("platform", "iOS");
    HttpProtocolBuilder httpProtocol52 = http
            .baseUrl("https://chatqa.clovedental.in")
            .wsBaseUrl("wss://chatqa.clovedental.in") // WebSocket URL
            .acceptHeader("text/plain, */*; q=0.01")
            .header("Sec-WebSocket-Version", "13")
            .header("Sec-WebSocket-Extensions", "permessage-deflate; client_max_window_bits; server_max_window_bits=15")
            .header("Sec-WebSocket-Key", "amxpZgVmbHh5bGljeXl2aQ==")
            .header("current_chat_id", "0")
            .header("userId", "12")
            .header("Connection", "Upgrade")
            .header("authToken", "DOs7Obj9VySGBQeizido4SB%2Bvab36ffTiwMNBWH4%2FHE%3D")
            .header("deviceId", "2")
            .header("connected_in", "2")
            .header("Upgrade", "websocket")
            .header("Host", "chatqa.clovedental.in:443")
            .header("Origin", "wss://chatqa.clovedental.in")
            .header("platform", "iOS");



    HttpProtocolBuilder httpProtocol53 = http
            .baseUrl("https://chatqa.clovedental.in")
            .wsBaseUrl("wss://chatqa.clovedental.in") // WebSocket URL
            .acceptHeader("text/plain, */*; q=0.01")
            .header("Sec-WebSocket-Version", "13")
            .header("Sec-WebSocket-Extensions", "permessage-deflate; client_max_window_bits; server_max_window_bits=15")
            .header("Sec-WebSocket-Key", "amxpZgVmbHh5bGljeXl2aQ==")
            .header("current_chat_id", "0")
            .header("userId", "15")
            .header("Connection", "Upgrade")
            .header("authToken", "N4S0cYkVJOViUWa5Oqqa%2Bi5l%2FsJhZa7H4%2Fu5e5OgGow%3D")
            .header("deviceId", "3")
            .header("connected_in", "2")
            .header("Upgrade", "websocket")
            .header("Host", "chatqa.clovedental.in:443")
            .header("Origin", "wss://chatqa.clovedental.in")
            .header("platform", "iOS");
    HttpProtocolBuilder httpProtocol54 = http
        .baseUrl("https://chatqa.clovedental.in")
        .wsBaseUrl("wss://chatqa.clovedental.in") // WebSocket URL
        .acceptHeader("text/plain, */*; q=0.01")
        .header("Sec-WebSocket-Version", "13")
        .header("Sec-WebSocket-Extensions", "permessage-deflate; client_max_window_bits; server_max_window_bits=15")
        .header("Sec-WebSocket-Key", "amxpZgVmbHh5bGljeXl2aQ==")
        .header("current_chat_id", "0")
        .header("userId", "14")
        .header("Connection", "Upgrade")
        .header("authToken", "W3WNF%2BGgnXSGZV%2Bp8uJFKLzVqk3dJs5s2cCpjVe0Yzk%3D")
        .header("deviceId", "1")
        .header("connected_in", "1")
        .header("Upgrade", "websocket")
        .header("Host", "chatqa.clovedental.in:443")
        .header("Origin", "wss://chatqa.clovedental.in")
        .header("platform", "iOS");
    HttpProtocolBuilder httpProtocol55 = http
            .baseUrl("https://chatqa.clovedental.in")
            .wsBaseUrl("wss://chatqa.clovedental.in") // WebSocket URL
            .acceptHeader("text/plain, */*; q=0.01")
            .header("Sec-WebSocket-Version", "13")
            .header("Sec-WebSocket-Extensions", "permessage-deflate; client_max_window_bits; server_max_window_bits=15")
            .header("Sec-WebSocket-Key", "amxpZgVmbHh5bGljeXl2aQ==")
            .header("current_chat_id", "0")
            .header("userId", "12")
            .header("Connection", "Upgrade")
            .header("authToken", "DOs7Obj9VySGBQeizido4SB%2Bvab36ffTiwMNBWH4%2FHE%3D")
            .header("deviceId", "2")
            .header("connected_in", "2")
            .header("Upgrade", "websocket")
            .header("Host", "chatqa.clovedental.in:443")
            .header("Origin", "wss://chatqa.clovedental.in")
            .header("platform", "iOS");



    HttpProtocolBuilder httpProtocol56 = http
            .baseUrl("https://chatqa.clovedental.in")
            .wsBaseUrl("wss://chatqa.clovedental.in") // WebSocket URL
            .acceptHeader("text/plain, */*; q=0.01")
            .header("Sec-WebSocket-Version", "13")
            .header("Sec-WebSocket-Extensions", "permessage-deflate; client_max_window_bits; server_max_window_bits=15")
            .header("Sec-WebSocket-Key", "amxpZgVmbHh5bGljeXl2aQ==")
            .header("current_chat_id", "0")
            .header("userId", "15")
            .header("Connection", "Upgrade")
            .header("authToken", "N4S0cYkVJOViUWa5Oqqa%2Bi5l%2FsJhZa7H4%2Fu5e5OgGow%3D")
            .header("deviceId", "3")
            .header("connected_in", "2")
            .header("Upgrade", "websocket")
            .header("Host", "chatqa.clovedental.in:443")
            .header("Origin", "wss://chatqa.clovedental.in")
            .header("platform", "iOS");
    HttpProtocolBuilder httpProtocol57 = http
        .baseUrl("https://chatqa.clovedental.in")
        .wsBaseUrl("wss://chatqa.clovedental.in") // WebSocket URL
        .acceptHeader("text/plain, */*; q=0.01")
        .header("Sec-WebSocket-Version", "13")
        .header("Sec-WebSocket-Extensions", "permessage-deflate; client_max_window_bits; server_max_window_bits=15")
        .header("Sec-WebSocket-Key", "amxpZgVmbHh5bGljeXl2aQ==")
        .header("current_chat_id", "0")
        .header("userId", "14")
        .header("Connection", "Upgrade")
        .header("authToken", "W3WNF%2BGgnXSGZV%2Bp8uJFKLzVqk3dJs5s2cCpjVe0Yzk%3D")
        .header("deviceId", "1")
        .header("connected_in", "1")
        .header("Upgrade", "websocket")
        .header("Host", "chatqa.clovedental.in:443")
        .header("Origin", "wss://chatqa.clovedental.in")
        .header("platform", "iOS");
    HttpProtocolBuilder httpProtocol58 = http
            .baseUrl("https://chatqa.clovedental.in")
            .wsBaseUrl("wss://chatqa.clovedental.in") // WebSocket URL
            .acceptHeader("text/plain, */*; q=0.01")
            .header("Sec-WebSocket-Version", "13")
            .header("Sec-WebSocket-Extensions", "permessage-deflate; client_max_window_bits; server_max_window_bits=15")
            .header("Sec-WebSocket-Key", "amxpZgVmbHh5bGljeXl2aQ==")
            .header("current_chat_id", "0")
            .header("userId", "12")
            .header("Connection", "Upgrade")
            .header("authToken", "DOs7Obj9VySGBQeizido4SB%2Bvab36ffTiwMNBWH4%2FHE%3D")
            .header("deviceId", "2")
            .header("connected_in", "2")
            .header("Upgrade", "websocket")
            .header("Host", "chatqa.clovedental.in:443")
            .header("Origin", "wss://chatqa.clovedental.in")
            .header("platform", "iOS");



    HttpProtocolBuilder httpProtocol59 = http
            .baseUrl("https://chatqa.clovedental.in")
            .wsBaseUrl("wss://chatqa.clovedental.in") // WebSocket URL
            .acceptHeader("text/plain, */*; q=0.01")
            .header("Sec-WebSocket-Version", "13")
            .header("Sec-WebSocket-Extensions", "permessage-deflate; client_max_window_bits; server_max_window_bits=15")
            .header("Sec-WebSocket-Key", "amxpZgVmbHh5bGljeXl2aQ==")
            .header("current_chat_id", "0")
            .header("userId", "15")
            .header("Connection", "Upgrade")
            .header("authToken", "N4S0cYkVJOViUWa5Oqqa%2Bi5l%2FsJhZa7H4%2Fu5e5OgGow%3D")
            .header("deviceId", "3")
            .header("connected_in", "2")
            .header("Upgrade", "websocket")
            .header("Host", "chatqa.clovedental.in:443")
            .header("Origin", "wss://chatqa.clovedental.in")
            .header("platform", "iOS");
    HttpProtocolBuilder httpProtocol60 = http
        .baseUrl("https://chatqa.clovedental.in")
        .wsBaseUrl("wss://chatqa.clovedental.in") // WebSocket URL
        .acceptHeader("text/plain, */*; q=0.01")
        .header("Sec-WebSocket-Version", "13")
        .header("Sec-WebSocket-Extensions", "permessage-deflate; client_max_window_bits; server_max_window_bits=15")
        .header("Sec-WebSocket-Key", "amxpZgVmbHh5bGljeXl2aQ==")
        .header("current_chat_id", "0")
        .header("userId", "14")
        .header("Connection", "Upgrade")
        .header("authToken", "W3WNF%2BGgnXSGZV%2Bp8uJFKLzVqk3dJs5s2cCpjVe0Yzk%3D")
        .header("deviceId", "1")
        .header("connected_in", "1")
        .header("Upgrade", "websocket")
        .header("Host", "chatqa.clovedental.in:443")
        .header("Origin", "wss://chatqa.clovedental.in")
        .header("platform", "iOS");
    HttpProtocolBuilder httpProtocol61 = http
            .baseUrl("https://chatqa.clovedental.in")
            .wsBaseUrl("wss://chatqa.clovedental.in") // WebSocket URL
            .acceptHeader("text/plain, */*; q=0.01")
            .header("Sec-WebSocket-Version", "13")
            .header("Sec-WebSocket-Extensions", "permessage-deflate; client_max_window_bits; server_max_window_bits=15")
            .header("Sec-WebSocket-Key", "amxpZgVmbHh5bGljeXl2aQ==")
            .header("current_chat_id", "0")
            .header("userId", "12")
            .header("Connection", "Upgrade")
            .header("authToken", "DOs7Obj9VySGBQeizido4SB%2Bvab36ffTiwMNBWH4%2FHE%3D")
            .header("deviceId", "2")
            .header("connected_in", "2")
            .header("Upgrade", "websocket")
            .header("Host", "chatqa.clovedental.in:443")
            .header("Origin", "wss://chatqa.clovedental.in")
            .header("platform", "iOS");



    HttpProtocolBuilder httpProtocol62 = http
            .baseUrl("https://chatqa.clovedental.in")
            .wsBaseUrl("wss://chatqa.clovedental.in") // WebSocket URL
            .acceptHeader("text/plain, */*; q=0.01")
            .header("Sec-WebSocket-Version", "13")
            .header("Sec-WebSocket-Extensions", "permessage-deflate; client_max_window_bits; server_max_window_bits=15")
            .header("Sec-WebSocket-Key", "amxpZgVmbHh5bGljeXl2aQ==")
            .header("current_chat_id", "0")
            .header("userId", "15")
            .header("Connection", "Upgrade")
            .header("authToken", "N4S0cYkVJOViUWa5Oqqa%2Bi5l%2FsJhZa7H4%2Fu5e5OgGow%3D")
            .header("deviceId", "3")
            .header("connected_in", "2")
            .header("Upgrade", "websocket")
            .header("Host", "chatqa.clovedental.in:443")
            .header("Origin", "wss://chatqa.clovedental.in")
            .header("platform", "iOS");
    HttpProtocolBuilder httpProtocol63 = http
        .baseUrl("https://chatqa.clovedental.in")
        .wsBaseUrl("wss://chatqa.clovedental.in") // WebSocket URL
        .acceptHeader("text/plain, */*; q=0.01")
        .header("Sec-WebSocket-Version", "13")
        .header("Sec-WebSocket-Extensions", "permessage-deflate; client_max_window_bits; server_max_window_bits=15")
        .header("Sec-WebSocket-Key", "amxpZgVmbHh5bGljeXl2aQ==")
        .header("current_chat_id", "0")
        .header("userId", "14")
        .header("Connection", "Upgrade")
        .header("authToken", "W3WNF%2BGgnXSGZV%2Bp8uJFKLzVqk3dJs5s2cCpjVe0Yzk%3D")
        .header("deviceId", "1")
        .header("connected_in", "1")
        .header("Upgrade", "websocket")
        .header("Host", "chatqa.clovedental.in:443")
        .header("Origin", "wss://chatqa.clovedental.in")
        .header("platform", "iOS");
    HttpProtocolBuilder httpProtocol64 = http
            .baseUrl("https://chatqa.clovedental.in")
            .wsBaseUrl("wss://chatqa.clovedental.in") // WebSocket URL
            .acceptHeader("text/plain, */*; q=0.01")
            .header("Sec-WebSocket-Version", "13")
            .header("Sec-WebSocket-Extensions", "permessage-deflate; client_max_window_bits; server_max_window_bits=15")
            .header("Sec-WebSocket-Key", "amxpZgVmbHh5bGljeXl2aQ==")
            .header("current_chat_id", "0")
            .header("userId", "12")
            .header("Connection", "Upgrade")
            .header("authToken", "DOs7Obj9VySGBQeizido4SB%2Bvab36ffTiwMNBWH4%2FHE%3D")
            .header("deviceId", "2")
            .header("connected_in", "2")
            .header("Upgrade", "websocket")
            .header("Host", "chatqa.clovedental.in:443")
            .header("Origin", "wss://chatqa.clovedental.in")
            .header("platform", "iOS");



    HttpProtocolBuilder httpProtocol65 = http
            .baseUrl("https://chatqa.clovedental.in")
            .wsBaseUrl("wss://chatqa.clovedental.in") // WebSocket URL
            .acceptHeader("text/plain, */*; q=0.01")
            .header("Sec-WebSocket-Version", "13")
            .header("Sec-WebSocket-Extensions", "permessage-deflate; client_max_window_bits; server_max_window_bits=15")
            .header("Sec-WebSocket-Key", "amxpZgVmbHh5bGljeXl2aQ==")
            .header("current_chat_id", "0")
            .header("userId", "15")
            .header("Connection", "Upgrade")
            .header("authToken", "N4S0cYkVJOViUWa5Oqqa%2Bi5l%2FsJhZa7H4%2Fu5e5OgGow%3D")
            .header("deviceId", "3")
            .header("connected_in", "2")
            .header("Upgrade", "websocket")
            .header("Host", "chatqa.clovedental.in:443")
            .header("Origin", "wss://chatqa.clovedental.in")
            .header("platform", "iOS");
    HttpProtocolBuilder httpProtocol66 = http
        .baseUrl("https://chatqa.clovedental.in")
        .wsBaseUrl("wss://chatqa.clovedental.in") // WebSocket URL
        .acceptHeader("text/plain, */*; q=0.01")
        .header("Sec-WebSocket-Version", "13")
        .header("Sec-WebSocket-Extensions", "permessage-deflate; client_max_window_bits; server_max_window_bits=15")
        .header("Sec-WebSocket-Key", "amxpZgVmbHh5bGljeXl2aQ==")
        .header("current_chat_id", "0")
        .header("userId", "14")
        .header("Connection", "Upgrade")
        .header("authToken", "W3WNF%2BGgnXSGZV%2Bp8uJFKLzVqk3dJs5s2cCpjVe0Yzk%3D")
        .header("deviceId", "1")
        .header("connected_in", "1")
        .header("Upgrade", "websocket")
        .header("Host", "chatqa.clovedental.in:443")
        .header("Origin", "wss://chatqa.clovedental.in")
        .header("platform", "iOS");
    HttpProtocolBuilder httpProtocol67 = http
            .baseUrl("https://chatqa.clovedental.in")
            .wsBaseUrl("wss://chatqa.clovedental.in") // WebSocket URL
            .acceptHeader("text/plain, */*; q=0.01")
            .header("Sec-WebSocket-Version", "13")
            .header("Sec-WebSocket-Extensions", "permessage-deflate; client_max_window_bits; server_max_window_bits=15")
            .header("Sec-WebSocket-Key", "amxpZgVmbHh5bGljeXl2aQ==")
            .header("current_chat_id", "0")
            .header("userId", "12")
            .header("Connection", "Upgrade")
            .header("authToken", "DOs7Obj9VySGBQeizido4SB%2Bvab36ffTiwMNBWH4%2FHE%3D")
            .header("deviceId", "2")
            .header("connected_in", "2")
            .header("Upgrade", "websocket")
            .header("Host", "chatqa.clovedental.in:443")
            .header("Origin", "wss://chatqa.clovedental.in")
            .header("platform", "iOS");



    HttpProtocolBuilder httpProtocol68 = http
            .baseUrl("https://chatqa.clovedental.in")
            .wsBaseUrl("wss://chatqa.clovedental.in") // WebSocket URL
            .acceptHeader("text/plain, */*; q=0.01")
            .header("Sec-WebSocket-Version", "13")
            .header("Sec-WebSocket-Extensions", "permessage-deflate; client_max_window_bits; server_max_window_bits=15")
            .header("Sec-WebSocket-Key", "amxpZgVmbHh5bGljeXl2aQ==")
            .header("current_chat_id", "0")
            .header("userId", "15")
            .header("Connection", "Upgrade")
            .header("authToken", "N4S0cYkVJOViUWa5Oqqa%2Bi5l%2FsJhZa7H4%2Fu5e5OgGow%3D")
            .header("deviceId", "3")
            .header("connected_in", "2")
            .header("Upgrade", "websocket")
            .header("Host", "chatqa.clovedental.in:443")
            .header("Origin", "wss://chatqa.clovedental.in")
            .header("platform", "iOS");
    HttpProtocolBuilder httpProtocol69 = http
        .baseUrl("https://chatqa.clovedental.in")
        .wsBaseUrl("wss://chatqa.clovedental.in") // WebSocket URL
        .acceptHeader("text/plain, */*; q=0.01")
        .header("Sec-WebSocket-Version", "13")
        .header("Sec-WebSocket-Extensions", "permessage-deflate; client_max_window_bits; server_max_window_bits=15")
        .header("Sec-WebSocket-Key", "amxpZgVmbHh5bGljeXl2aQ==")
        .header("current_chat_id", "0")
        .header("userId", "14")
        .header("Connection", "Upgrade")
        .header("authToken", "W3WNF%2BGgnXSGZV%2Bp8uJFKLzVqk3dJs5s2cCpjVe0Yzk%3D")
        .header("deviceId", "1")
        .header("connected_in", "1")
        .header("Upgrade", "websocket")
        .header("Host", "chatqa.clovedental.in:443")
        .header("Origin", "wss://chatqa.clovedental.in")
        .header("platform", "iOS");
    HttpProtocolBuilder httpProtocol70 = http
            .baseUrl("https://chatqa.clovedental.in")
            .wsBaseUrl("wss://chatqa.clovedental.in") // WebSocket URL
            .acceptHeader("text/plain, */*; q=0.01")
            .header("Sec-WebSocket-Version", "13")
            .header("Sec-WebSocket-Extensions", "permessage-deflate; client_max_window_bits; server_max_window_bits=15")
            .header("Sec-WebSocket-Key", "amxpZgVmbHh5bGljeXl2aQ==")
            .header("current_chat_id", "0")
            .header("userId", "12")
            .header("Connection", "Upgrade")
            .header("authToken", "DOs7Obj9VySGBQeizido4SB%2Bvab36ffTiwMNBWH4%2FHE%3D")
            .header("deviceId", "2")
            .header("connected_in", "2")
            .header("Upgrade", "websocket")
            .header("Host", "chatqa.clovedental.in:443")
            .header("Origin", "wss://chatqa.clovedental.in")
            .header("platform", "iOS");



    HttpProtocolBuilder httpProtocol71 = http
            .baseUrl("https://chatqa.clovedental.in")
            .wsBaseUrl("wss://chatqa.clovedental.in") // WebSocket URL
            .acceptHeader("text/plain, */*; q=0.01")
            .header("Sec-WebSocket-Version", "13")
            .header("Sec-WebSocket-Extensions", "permessage-deflate; client_max_window_bits; server_max_window_bits=15")
            .header("Sec-WebSocket-Key", "amxpZgVmbHh5bGljeXl2aQ==")
            .header("current_chat_id", "0")
            .header("userId", "15")
            .header("Connection", "Upgrade")
            .header("authToken", "N4S0cYkVJOViUWa5Oqqa%2Bi5l%2FsJhZa7H4%2Fu5e5OgGow%3D")
            .header("deviceId", "3")
            .header("connected_in", "2")
            .header("Upgrade", "websocket")
            .header("Host", "chatqa.clovedental.in:443")
            .header("Origin", "wss://chatqa.clovedental.in")
            .header("platform", "iOS");
    HttpProtocolBuilder httpProtocol72 = http
        .baseUrl("https://chatqa.clovedental.in")
        .wsBaseUrl("wss://chatqa.clovedental.in") // WebSocket URL
        .acceptHeader("text/plain, */*; q=0.01")
        .header("Sec-WebSocket-Version", "13")
        .header("Sec-WebSocket-Extensions", "permessage-deflate; client_max_window_bits; server_max_window_bits=15")
        .header("Sec-WebSocket-Key", "amxpZgVmbHh5bGljeXl2aQ==")
        .header("current_chat_id", "0")
        .header("userId", "14")
        .header("Connection", "Upgrade")
        .header("authToken", "W3WNF%2BGgnXSGZV%2Bp8uJFKLzVqk3dJs5s2cCpjVe0Yzk%3D")
        .header("deviceId", "1")
        .header("connected_in", "1")
        .header("Upgrade", "websocket")
        .header("Host", "chatqa.clovedental.in:443")
        .header("Origin", "wss://chatqa.clovedental.in")
        .header("platform", "iOS");
    HttpProtocolBuilder httpProtocol73 = http
            .baseUrl("https://chatqa.clovedental.in")
            .wsBaseUrl("wss://chatqa.clovedental.in") // WebSocket URL
            .acceptHeader("text/plain, */*; q=0.01")
            .header("Sec-WebSocket-Version", "13")
            .header("Sec-WebSocket-Extensions", "permessage-deflate; client_max_window_bits; server_max_window_bits=15")
            .header("Sec-WebSocket-Key", "amxpZgVmbHh5bGljeXl2aQ==")
            .header("current_chat_id", "0")
            .header("userId", "12")
            .header("Connection", "Upgrade")
            .header("authToken", "DOs7Obj9VySGBQeizido4SB%2Bvab36ffTiwMNBWH4%2FHE%3D")
            .header("deviceId", "2")
            .header("connected_in", "2")
            .header("Upgrade", "websocket")
            .header("Host", "chatqa.clovedental.in:443")
            .header("Origin", "wss://chatqa.clovedental.in")
            .header("platform", "iOS");



    HttpProtocolBuilder httpProtocol74 = http
            .baseUrl("https://chatqa.clovedental.in")
            .wsBaseUrl("wss://chatqa.clovedental.in") // WebSocket URL
            .acceptHeader("text/plain, */*; q=0.01")
            .header("Sec-WebSocket-Version", "13")
            .header("Sec-WebSocket-Extensions", "permessage-deflate; client_max_window_bits; server_max_window_bits=15")
            .header("Sec-WebSocket-Key", "amxpZgVmbHh5bGljeXl2aQ==")
            .header("current_chat_id", "0")
            .header("userId", "15")
            .header("Connection", "Upgrade")
            .header("authToken", "N4S0cYkVJOViUWa5Oqqa%2Bi5l%2FsJhZa7H4%2Fu5e5OgGow%3D")
            .header("deviceId", "3")
            .header("connected_in", "2")
            .header("Upgrade", "websocket")
            .header("Host", "chatqa.clovedental.in:443")
            .header("Origin", "wss://chatqa.clovedental.in")
            .header("platform", "iOS");
    HttpProtocolBuilder httpProtocol75 = http
        .baseUrl("https://chatqa.clovedental.in")
        .wsBaseUrl("wss://chatqa.clovedental.in") // WebSocket URL
        .acceptHeader("text/plain, */*; q=0.01")
        .header("Sec-WebSocket-Version", "13")
        .header("Sec-WebSocket-Extensions", "permessage-deflate; client_max_window_bits; server_max_window_bits=15")
        .header("Sec-WebSocket-Key", "amxpZgVmbHh5bGljeXl2aQ==")
        .header("current_chat_id", "0")
        .header("userId", "14")
        .header("Connection", "Upgrade")
        .header("authToken", "W3WNF%2BGgnXSGZV%2Bp8uJFKLzVqk3dJs5s2cCpjVe0Yzk%3D")
        .header("deviceId", "1")
        .header("connected_in", "1")
        .header("Upgrade", "websocket")
        .header("Host", "chatqa.clovedental.in:443")
        .header("Origin", "wss://chatqa.clovedental.in")
        .header("platform", "iOS");
    HttpProtocolBuilder httpProtocol76 = http
            .baseUrl("https://chatqa.clovedental.in")
            .wsBaseUrl("wss://chatqa.clovedental.in") // WebSocket URL
            .acceptHeader("text/plain, */*; q=0.01")
            .header("Sec-WebSocket-Version", "13")
            .header("Sec-WebSocket-Extensions", "permessage-deflate; client_max_window_bits; server_max_window_bits=15")
            .header("Sec-WebSocket-Key", "amxpZgVmbHh5bGljeXl2aQ==")
            .header("current_chat_id", "0")
            .header("userId", "12")
            .header("Connection", "Upgrade")
            .header("authToken", "DOs7Obj9VySGBQeizido4SB%2Bvab36ffTiwMNBWH4%2FHE%3D")
            .header("deviceId", "2")
            .header("connected_in", "2")
            .header("Upgrade", "websocket")
            .header("Host", "chatqa.clovedental.in:443")
            .header("Origin", "wss://chatqa.clovedental.in")
            .header("platform", "iOS");



    HttpProtocolBuilder httpProtocol77 = http
            .baseUrl("https://chatqa.clovedental.in")
            .wsBaseUrl("wss://chatqa.clovedental.in") // WebSocket URL
            .acceptHeader("text/plain, */*; q=0.01")
            .header("Sec-WebSocket-Version", "13")
            .header("Sec-WebSocket-Extensions", "permessage-deflate; client_max_window_bits; server_max_window_bits=15")
            .header("Sec-WebSocket-Key", "amxpZgVmbHh5bGljeXl2aQ==")
            .header("current_chat_id", "0")
            .header("userId", "15")
            .header("Connection", "Upgrade")
            .header("authToken", "N4S0cYkVJOViUWa5Oqqa%2Bi5l%2FsJhZa7H4%2Fu5e5OgGow%3D")
            .header("deviceId", "3")
            .header("connected_in", "2")
            .header("Upgrade", "websocket")
            .header("Host", "chatqa.clovedental.in:443")
            .header("Origin", "wss://chatqa.clovedental.in")
            .header("platform", "iOS");
    HttpProtocolBuilder httpProtocol78 = http
        .baseUrl("https://chatqa.clovedental.in")
        .wsBaseUrl("wss://chatqa.clovedental.in") // WebSocket URL
        .acceptHeader("text/plain, */*; q=0.01")
        .header("Sec-WebSocket-Version", "13")
        .header("Sec-WebSocket-Extensions", "permessage-deflate; client_max_window_bits; server_max_window_bits=15")
        .header("Sec-WebSocket-Key", "amxpZgVmbHh5bGljeXl2aQ==")
        .header("current_chat_id", "0")
        .header("userId", "14")
        .header("Connection", "Upgrade")
        .header("authToken", "W3WNF%2BGgnXSGZV%2Bp8uJFKLzVqk3dJs5s2cCpjVe0Yzk%3D")
        .header("deviceId", "1")
        .header("connected_in", "1")
        .header("Upgrade", "websocket")
        .header("Host", "chatqa.clovedental.in:443")
        .header("Origin", "wss://chatqa.clovedental.in")
        .header("platform", "iOS");
    HttpProtocolBuilder httpProtocol79 = http
            .baseUrl("https://chatqa.clovedental.in")
            .wsBaseUrl("wss://chatqa.clovedental.in") // WebSocket URL
            .acceptHeader("text/plain, */*; q=0.01")
            .header("Sec-WebSocket-Version", "13")
            .header("Sec-WebSocket-Extensions", "permessage-deflate; client_max_window_bits; server_max_window_bits=15")
            .header("Sec-WebSocket-Key", "amxpZgVmbHh5bGljeXl2aQ==")
            .header("current_chat_id", "0")
            .header("userId", "12")
            .header("Connection", "Upgrade")
            .header("authToken", "DOs7Obj9VySGBQeizido4SB%2Bvab36ffTiwMNBWH4%2FHE%3D")
            .header("deviceId", "2")
            .header("connected_in", "2")
            .header("Upgrade", "websocket")
            .header("Host", "chatqa.clovedental.in:443")
            .header("Origin", "wss://chatqa.clovedental.in")
            .header("platform", "iOS");



    HttpProtocolBuilder httpProtocol80 = http
            .baseUrl("https://chatqa.clovedental.in")
            .wsBaseUrl("wss://chatqa.clovedental.in") // WebSocket URL
            .acceptHeader("text/plain, */*; q=0.01")
            .header("Sec-WebSocket-Version", "13")
            .header("Sec-WebSocket-Extensions", "permessage-deflate; client_max_window_bits; server_max_window_bits=15")
            .header("Sec-WebSocket-Key", "amxpZgVmbHh5bGljeXl2aQ==")
            .header("current_chat_id", "0")
            .header("userId", "15")
            .header("Connection", "Upgrade")
            .header("authToken", "N4S0cYkVJOViUWa5Oqqa%2Bi5l%2FsJhZa7H4%2Fu5e5OgGow%3D")
            .header("deviceId", "3")
            .header("connected_in", "2")
            .header("Upgrade", "websocket")
            .header("Host", "chatqa.clovedental.in:443")
            .header("Origin", "wss://chatqa.clovedental.in")
            .header("platform", "iOS");
    HttpProtocolBuilder httpProtocol81 = http
        .baseUrl("https://chatqa.clovedental.in")
        .wsBaseUrl("wss://chatqa.clovedental.in") // WebSocket URL
        .acceptHeader("text/plain, */*; q=0.01")
        .header("Sec-WebSocket-Version", "13")
        .header("Sec-WebSocket-Extensions", "permessage-deflate; client_max_window_bits; server_max_window_bits=15")
        .header("Sec-WebSocket-Key", "amxpZgVmbHh5bGljeXl2aQ==")
        .header("current_chat_id", "0")
        .header("userId", "14")
        .header("Connection", "Upgrade")
        .header("authToken", "W3WNF%2BGgnXSGZV%2Bp8uJFKLzVqk3dJs5s2cCpjVe0Yzk%3D")
        .header("deviceId", "1")
        .header("connected_in", "1")
        .header("Upgrade", "websocket")
        .header("Host", "chatqa.clovedental.in:443")
        .header("Origin", "wss://chatqa.clovedental.in")
        .header("platform", "iOS");
    HttpProtocolBuilder httpProtocol82 = http
            .baseUrl("https://chatqa.clovedental.in")
            .wsBaseUrl("wss://chatqa.clovedental.in") // WebSocket URL
            .acceptHeader("text/plain, */*; q=0.01")
            .header("Sec-WebSocket-Version", "13")
            .header("Sec-WebSocket-Extensions", "permessage-deflate; client_max_window_bits; server_max_window_bits=15")
            .header("Sec-WebSocket-Key", "amxpZgVmbHh5bGljeXl2aQ==")
            .header("current_chat_id", "0")
            .header("userId", "12")
            .header("Connection", "Upgrade")
            .header("authToken", "DOs7Obj9VySGBQeizido4SB%2Bvab36ffTiwMNBWH4%2FHE%3D")
            .header("deviceId", "2")
            .header("connected_in", "2")
            .header("Upgrade", "websocket")
            .header("Host", "chatqa.clovedental.in:443")
            .header("Origin", "wss://chatqa.clovedental.in")
            .header("platform", "iOS");



    HttpProtocolBuilder httpProtocol83 = http
            .baseUrl("https://chatqa.clovedental.in")
            .wsBaseUrl("wss://chatqa.clovedental.in") // WebSocket URL
            .acceptHeader("text/plain, */*; q=0.01")
            .header("Sec-WebSocket-Version", "13")
            .header("Sec-WebSocket-Extensions", "permessage-deflate; client_max_window_bits; server_max_window_bits=15")
            .header("Sec-WebSocket-Key", "amxpZgVmbHh5bGljeXl2aQ==")
            .header("current_chat_id", "0")
            .header("userId", "15")
            .header("Connection", "Upgrade")
            .header("authToken", "N4S0cYkVJOViUWa5Oqqa%2Bi5l%2FsJhZa7H4%2Fu5e5OgGow%3D")
            .header("deviceId", "3")
            .header("connected_in", "2")
            .header("Upgrade", "websocket")
            .header("Host", "chatqa.clovedental.in:443")
            .header("Origin", "wss://chatqa.clovedental.in")
            .header("platform", "iOS");
    HttpProtocolBuilder httpProtocol84 = http
        .baseUrl("https://chatqa.clovedental.in")
        .wsBaseUrl("wss://chatqa.clovedental.in") // WebSocket URL
        .acceptHeader("text/plain, */*; q=0.01")
        .header("Sec-WebSocket-Version", "13")
        .header("Sec-WebSocket-Extensions", "permessage-deflate; client_max_window_bits; server_max_window_bits=15")
        .header("Sec-WebSocket-Key", "amxpZgVmbHh5bGljeXl2aQ==")
        .header("current_chat_id", "0")
        .header("userId", "14")
        .header("Connection", "Upgrade")
        .header("authToken", "W3WNF%2BGgnXSGZV%2Bp8uJFKLzVqk3dJs5s2cCpjVe0Yzk%3D")
        .header("deviceId", "1")
        .header("connected_in", "1")
        .header("Upgrade", "websocket")
        .header("Host", "chatqa.clovedental.in:443")
        .header("Origin", "wss://chatqa.clovedental.in")
        .header("platform", "iOS");
    HttpProtocolBuilder httpProtocol85 = http
            .baseUrl("https://chatqa.clovedental.in")
            .wsBaseUrl("wss://chatqa.clovedental.in") // WebSocket URL
            .acceptHeader("text/plain, */*; q=0.01")
            .header("Sec-WebSocket-Version", "13")
            .header("Sec-WebSocket-Extensions", "permessage-deflate; client_max_window_bits; server_max_window_bits=15")
            .header("Sec-WebSocket-Key", "amxpZgVmbHh5bGljeXl2aQ==")
            .header("current_chat_id", "0")
            .header("userId", "12")
            .header("Connection", "Upgrade")
            .header("authToken", "DOs7Obj9VySGBQeizido4SB%2Bvab36ffTiwMNBWH4%2FHE%3D")
            .header("deviceId", "2")
            .header("connected_in", "2")
            .header("Upgrade", "websocket")
            .header("Host", "chatqa.clovedental.in:443")
            .header("Origin", "wss://chatqa.clovedental.in")
            .header("platform", "iOS");



    HttpProtocolBuilder httpProtocol86 = http
            .baseUrl("https://chatqa.clovedental.in")
            .wsBaseUrl("wss://chatqa.clovedental.in") // WebSocket URL
            .acceptHeader("text/plain, */*; q=0.01")
            .header("Sec-WebSocket-Version", "13")
            .header("Sec-WebSocket-Extensions", "permessage-deflate; client_max_window_bits; server_max_window_bits=15")
            .header("Sec-WebSocket-Key", "amxpZgVmbHh5bGljeXl2aQ==")
            .header("current_chat_id", "0")
            .header("userId", "15")
            .header("Connection", "Upgrade")
            .header("authToken", "N4S0cYkVJOViUWa5Oqqa%2Bi5l%2FsJhZa7H4%2Fu5e5OgGow%3D")
            .header("deviceId", "3")
            .header("connected_in", "2")
            .header("Upgrade", "websocket")
            .header("Host", "chatqa.clovedental.in:443")
            .header("Origin", "wss://chatqa.clovedental.in")
            .header("platform", "iOS");
    HttpProtocolBuilder httpProtocol87 = http
        .baseUrl("https://chatqa.clovedental.in")
        .wsBaseUrl("wss://chatqa.clovedental.in") // WebSocket URL
        .acceptHeader("text/plain, */*; q=0.01")
        .header("Sec-WebSocket-Version", "13")
        .header("Sec-WebSocket-Extensions", "permessage-deflate; client_max_window_bits; server_max_window_bits=15")
        .header("Sec-WebSocket-Key", "amxpZgVmbHh5bGljeXl2aQ==")
        .header("current_chat_id", "0")
        .header("userId", "14")
        .header("Connection", "Upgrade")
        .header("authToken", "W3WNF%2BGgnXSGZV%2Bp8uJFKLzVqk3dJs5s2cCpjVe0Yzk%3D")
        .header("deviceId", "1")
        .header("connected_in", "1")
        .header("Upgrade", "websocket")
        .header("Host", "chatqa.clovedental.in:443")
        .header("Origin", "wss://chatqa.clovedental.in")
        .header("platform", "iOS");
    HttpProtocolBuilder httpProtocol88 = http
            .baseUrl("https://chatqa.clovedental.in")
            .wsBaseUrl("wss://chatqa.clovedental.in") // WebSocket URL
            .acceptHeader("text/plain, */*; q=0.01")
            .header("Sec-WebSocket-Version", "13")
            .header("Sec-WebSocket-Extensions", "permessage-deflate; client_max_window_bits; server_max_window_bits=15")
            .header("Sec-WebSocket-Key", "amxpZgVmbHh5bGljeXl2aQ==")
            .header("current_chat_id", "0")
            .header("userId", "12")
            .header("Connection", "Upgrade")
            .header("authToken", "DOs7Obj9VySGBQeizido4SB%2Bvab36ffTiwMNBWH4%2FHE%3D")
            .header("deviceId", "2")
            .header("connected_in", "2")
            .header("Upgrade", "websocket")
            .header("Host", "chatqa.clovedental.in:443")
            .header("Origin", "wss://chatqa.clovedental.in")
            .header("platform", "iOS");



    HttpProtocolBuilder httpProtocol89 = http
            .baseUrl("https://chatqa.clovedental.in")
            .wsBaseUrl("wss://chatqa.clovedental.in") // WebSocket URL
            .acceptHeader("text/plain, */*; q=0.01")
            .header("Sec-WebSocket-Version", "13")
            .header("Sec-WebSocket-Extensions", "permessage-deflate; client_max_window_bits; server_max_window_bits=15")
            .header("Sec-WebSocket-Key", "amxpZgVmbHh5bGljeXl2aQ==")
            .header("current_chat_id", "0")
            .header("userId", "15")
            .header("Connection", "Upgrade")
            .header("authToken", "N4S0cYkVJOViUWa5Oqqa%2Bi5l%2FsJhZa7H4%2Fu5e5OgGow%3D")
            .header("deviceId", "3")
            .header("connected_in", "2")
            .header("Upgrade", "websocket")
            .header("Host", "chatqa.clovedental.in:443")
            .header("Origin", "wss://chatqa.clovedental.in")
            .header("platform", "iOS");
    HttpProtocolBuilder httpProtocol90 = http
        .baseUrl("https://chatqa.clovedental.in")
        .wsBaseUrl("wss://chatqa.clovedental.in") // WebSocket URL
        .acceptHeader("text/plain, */*; q=0.01")
        .header("Sec-WebSocket-Version", "13")
        .header("Sec-WebSocket-Extensions", "permessage-deflate; client_max_window_bits; server_max_window_bits=15")
        .header("Sec-WebSocket-Key", "amxpZgVmbHh5bGljeXl2aQ==")
        .header("current_chat_id", "0")
        .header("userId", "14")
        .header("Connection", "Upgrade")
        .header("authToken", "W3WNF%2BGgnXSGZV%2Bp8uJFKLzVqk3dJs5s2cCpjVe0Yzk%3D")
        .header("deviceId", "1")
        .header("connected_in", "1")
        .header("Upgrade", "websocket")
        .header("Host", "chatqa.clovedental.in:443")
        .header("Origin", "wss://chatqa.clovedental.in")
        .header("platform", "iOS");
    HttpProtocolBuilder httpProtocol91 = http
            .baseUrl("https://chatqa.clovedental.in")
            .wsBaseUrl("wss://chatqa.clovedental.in") // WebSocket URL
            .acceptHeader("text/plain, */*; q=0.01")
            .header("Sec-WebSocket-Version", "13")
            .header("Sec-WebSocket-Extensions", "permessage-deflate; client_max_window_bits; server_max_window_bits=15")
            .header("Sec-WebSocket-Key", "amxpZgVmbHh5bGljeXl2aQ==")
            .header("current_chat_id", "0")
            .header("userId", "12")
            .header("Connection", "Upgrade")
            .header("authToken", "DOs7Obj9VySGBQeizido4SB%2Bvab36ffTiwMNBWH4%2FHE%3D")
            .header("deviceId", "2")
            .header("connected_in", "2")
            .header("Upgrade", "websocket")
            .header("Host", "chatqa.clovedental.in:443")
            .header("Origin", "wss://chatqa.clovedental.in")
            .header("platform", "iOS");



    HttpProtocolBuilder httpProtocol92 = http
            .baseUrl("https://chatqa.clovedental.in")
            .wsBaseUrl("wss://chatqa.clovedental.in") // WebSocket URL
            .acceptHeader("text/plain, */*; q=0.01")
            .header("Sec-WebSocket-Version", "13")
            .header("Sec-WebSocket-Extensions", "permessage-deflate; client_max_window_bits; server_max_window_bits=15")
            .header("Sec-WebSocket-Key", "amxpZgVmbHh5bGljeXl2aQ==")
            .header("current_chat_id", "0")
            .header("userId", "15")
            .header("Connection", "Upgrade")
            .header("authToken", "N4S0cYkVJOViUWa5Oqqa%2Bi5l%2FsJhZa7H4%2Fu5e5OgGow%3D")
            .header("deviceId", "3")
            .header("connected_in", "2")
            .header("Upgrade", "websocket")
            .header("Host", "chatqa.clovedental.in:443")
            .header("Origin", "wss://chatqa.clovedental.in")
            .header("platform", "iOS");
    HttpProtocolBuilder httpProtocol93 = http
        .baseUrl("https://chatqa.clovedental.in")
        .wsBaseUrl("wss://chatqa.clovedental.in") // WebSocket URL
        .acceptHeader("text/plain, */*; q=0.01")
        .header("Sec-WebSocket-Version", "13")
        .header("Sec-WebSocket-Extensions", "permessage-deflate; client_max_window_bits; server_max_window_bits=15")
        .header("Sec-WebSocket-Key", "amxpZgVmbHh5bGljeXl2aQ==")
        .header("current_chat_id", "0")
        .header("userId", "14")
        .header("Connection", "Upgrade")
        .header("authToken", "W3WNF%2BGgnXSGZV%2Bp8uJFKLzVqk3dJs5s2cCpjVe0Yzk%3D")
        .header("deviceId", "1")
        .header("connected_in", "1")
        .header("Upgrade", "websocket")
        .header("Host", "chatqa.clovedental.in:443")
        .header("Origin", "wss://chatqa.clovedental.in")
        .header("platform", "iOS");
    HttpProtocolBuilder httpProtocol94 = http
            .baseUrl("https://chatqa.clovedental.in")
            .wsBaseUrl("wss://chatqa.clovedental.in") // WebSocket URL
            .acceptHeader("text/plain, */*; q=0.01")
            .header("Sec-WebSocket-Version", "13")
            .header("Sec-WebSocket-Extensions", "permessage-deflate; client_max_window_bits; server_max_window_bits=15")
            .header("Sec-WebSocket-Key", "amxpZgVmbHh5bGljeXl2aQ==")
            .header("current_chat_id", "0")
            .header("userId", "12")
            .header("Connection", "Upgrade")
            .header("authToken", "DOs7Obj9VySGBQeizido4SB%2Bvab36ffTiwMNBWH4%2FHE%3D")
            .header("deviceId", "2")
            .header("connected_in", "2")
            .header("Upgrade", "websocket")
            .header("Host", "chatqa.clovedental.in:443")
            .header("Origin", "wss://chatqa.clovedental.in")
            .header("platform", "iOS");



    HttpProtocolBuilder httpProtocol95 = http
            .baseUrl("https://chatqa.clovedental.in")
            .wsBaseUrl("wss://chatqa.clovedental.in") // WebSocket URL
            .acceptHeader("text/plain, */*; q=0.01")
            .header("Sec-WebSocket-Version", "13")
            .header("Sec-WebSocket-Extensions", "permessage-deflate; client_max_window_bits; server_max_window_bits=15")
            .header("Sec-WebSocket-Key", "amxpZgVmbHh5bGljeXl2aQ==")
            .header("current_chat_id", "0")
            .header("userId", "15")
            .header("Connection", "Upgrade")
            .header("authToken", "N4S0cYkVJOViUWa5Oqqa%2Bi5l%2FsJhZa7H4%2Fu5e5OgGow%3D")
            .header("deviceId", "3")
            .header("connected_in", "2")
            .header("Upgrade", "websocket")
            .header("Host", "chatqa.clovedental.in:443")
            .header("Origin", "wss://chatqa.clovedental.in")
            .header("platform", "iOS");
    HttpProtocolBuilder httpProtocol96 = http
        .baseUrl("https://chatqa.clovedental.in")
        .wsBaseUrl("wss://chatqa.clovedental.in") // WebSocket URL
        .acceptHeader("text/plain, */*; q=0.01")
        .header("Sec-WebSocket-Version", "13")
        .header("Sec-WebSocket-Extensions", "permessage-deflate; client_max_window_bits; server_max_window_bits=15")
        .header("Sec-WebSocket-Key", "amxpZgVmbHh5bGljeXl2aQ==")
        .header("current_chat_id", "0")
        .header("userId", "14")
        .header("Connection", "Upgrade")
        .header("authToken", "W3WNF%2BGgnXSGZV%2Bp8uJFKLzVqk3dJs5s2cCpjVe0Yzk%3D")
        .header("deviceId", "1")
        .header("connected_in", "1")
        .header("Upgrade", "websocket")
        .header("Host", "chatqa.clovedental.in:443")
        .header("Origin", "wss://chatqa.clovedental.in")
        .header("platform", "iOS");
    HttpProtocolBuilder httpProtocol97 = http
            .baseUrl("https://chatqa.clovedental.in")
            .wsBaseUrl("wss://chatqa.clovedental.in") // WebSocket URL
            .acceptHeader("text/plain, */*; q=0.01")
            .header("Sec-WebSocket-Version", "13")
            .header("Sec-WebSocket-Extensions", "permessage-deflate; client_max_window_bits; server_max_window_bits=15")
            .header("Sec-WebSocket-Key", "amxpZgVmbHh5bGljeXl2aQ==")
            .header("current_chat_id", "0")
            .header("userId", "12")
            .header("Connection", "Upgrade")
            .header("authToken", "DOs7Obj9VySGBQeizido4SB%2Bvab36ffTiwMNBWH4%2FHE%3D")
            .header("deviceId", "2")
            .header("connected_in", "2")
            .header("Upgrade", "websocket")
            .header("Host", "chatqa.clovedental.in:443")
            .header("Origin", "wss://chatqa.clovedental.in")
            .header("platform", "iOS");



    HttpProtocolBuilder httpProtocol98 = http
            .baseUrl("https://chatqa.clovedental.in")
            .wsBaseUrl("wss://chatqa.clovedental.in") // WebSocket URL
            .acceptHeader("text/plain, */*; q=0.01")
            .header("Sec-WebSocket-Version", "13")
            .header("Sec-WebSocket-Extensions", "permessage-deflate; client_max_window_bits; server_max_window_bits=15")
            .header("Sec-WebSocket-Key", "amxpZgVmbHh5bGljeXl2aQ==")
            .header("current_chat_id", "0")
            .header("userId", "15")
            .header("Connection", "Upgrade")
            .header("authToken", "N4S0cYkVJOViUWa5Oqqa%2Bi5l%2FsJhZa7H4%2Fu5e5OgGow%3D")
            .header("deviceId", "3")
            .header("connected_in", "2")
            .header("Upgrade", "websocket")
            .header("Host", "chatqa.clovedental.in:443")
            .header("Origin", "wss://chatqa.clovedental.in")
            .header("platform", "iOS");
    HttpProtocolBuilder httpProtocol99 = http
        .baseUrl("https://chatqa.clovedental.in")
        .wsBaseUrl("wss://chatqa.clovedental.in") // WebSocket URL
        .acceptHeader("text/plain, */*; q=0.01")
        .header("Sec-WebSocket-Version", "13")
        .header("Sec-WebSocket-Extensions", "permessage-deflate; client_max_window_bits; server_max_window_bits=15")
        .header("Sec-WebSocket-Key", "amxpZgVmbHh5bGljeXl2aQ==")
        .header("current_chat_id", "0")
        .header("userId", "14")
        .header("Connection", "Upgrade")
        .header("authToken", "W3WNF%2BGgnXSGZV%2Bp8uJFKLzVqk3dJs5s2cCpjVe0Yzk%3D")
        .header("deviceId", "1")
        .header("connected_in", "1")
        .header("Upgrade", "websocket")
        .header("Host", "chatqa.clovedental.in:443")
        .header("Origin", "wss://chatqa.clovedental.in")
        .header("platform", "iOS");
    HttpProtocolBuilder httpProtocol100 = http
            .baseUrl("https://chatqa.clovedental.in")
            .wsBaseUrl("wss://chatqa.clovedental.in") // WebSocket URL
            .acceptHeader("text/plain, */*; q=0.01")
            .header("Sec-WebSocket-Version", "13")
            .header("Sec-WebSocket-Extensions", "permessage-deflate; client_max_window_bits; server_max_window_bits=15")
            .header("Sec-WebSocket-Key", "amxpZgVmbHh5bGljeXl2aQ==")
            .header("current_chat_id", "0")
            .header("userId", "12")
            .header("Connection", "Upgrade")
            .header("authToken", "DOs7Obj9VySGBQeizido4SB%2Bvab36ffTiwMNBWH4%2FHE%3D")
            .header("deviceId", "2")
            .header("connected_in", "2")
            .header("Upgrade", "websocket")
            .header("Host", "chatqa.clovedental.in:443")
            .header("Origin", "wss://chatqa.clovedental.in")
            .header("platform", "iOS");

  ScenarioBuilder scn0 = scenario("user").exec(ws("WebSocket Connect").connect("/wss2/socket")).pause(120);
  ScenarioBuilder scn1 = scenario("user 2").exec(ws("WebSocket Connect").connect("/wss2/socket")).pause(120);
   ScenarioBuilder scn2 = scenario("user 3").exec(ws("WebSocket Connect").connect("/wss2/socket")).pause(120);

    ScenarioBuilder scn3 = scenario("user3").exec(ws("WebSocket Connect").connect("/wss2/socket")).pause(120);
    ScenarioBuilder scn4 = scenario("user4").exec(ws("WebSocket Connect").connect("/wss2/socket")).pause(120);
    ScenarioBuilder scn5 = scenario("user5").exec(ws("WebSocket Connect").connect("/wss2/socket")).pause(120);
    ScenarioBuilder scn6 = scenario("user6").exec(ws("WebSocket Connect").connect("/wss2/socket")).pause(120);
    ScenarioBuilder scn7 = scenario("user7").exec(ws("WebSocket Connect").connect("/wss2/socket")).pause(120);
    ScenarioBuilder scn8 = scenario("user8").exec(ws("WebSocket Connect").connect("/wss2/socket")).pause(120);
    ScenarioBuilder scn9 = scenario("user9").exec(ws("WebSocket Connect").connect("/wss2/socket")).pause(120);
    ScenarioBuilder scn10 = scenario("user10").exec(ws("WebSocket Connect").connect("/wss2/socket")).pause(120);
    ScenarioBuilder scn11 = scenario("user11").exec(ws("WebSocket Connect").connect("/wss2/socket")).pause(120);
    ScenarioBuilder scn12 = scenario("user12").exec(ws("WebSocket Connect").connect("/wss2/socket")).pause(120);
    ScenarioBuilder scn13 = scenario("user13").exec(ws("WebSocket Connect").connect("/wss2/socket")).pause(120);
    ScenarioBuilder scn14 = scenario("user14").exec(ws("WebSocket Connect").connect("/wss2/socket")).pause(120);
    ScenarioBuilder scn15 = scenario("user15").exec(ws("WebSocket Connect").connect("/wss2/socket")).pause(120);
    ScenarioBuilder scn16 = scenario("user16").exec(ws("WebSocket Connect").connect("/wss2/socket")).pause(120);
    ScenarioBuilder scn17 = scenario("user17").exec(ws("WebSocket Connect").connect("/wss2/socket")).pause(120);
    ScenarioBuilder scn18 = scenario("user18").exec(ws("WebSocket Connect").connect("/wss2/socket")).pause(120);
    ScenarioBuilder scn19 = scenario("user19").exec(ws("WebSocket Connect").connect("/wss2/socket")).pause(120);
    ScenarioBuilder scn20 = scenario("user20").exec(ws("WebSocket Connect").connect("/wss2/socket")).pause(120);
    ScenarioBuilder scn21 = scenario("user21").exec(ws("WebSocket Connect").connect("/wss2/socket")).pause(120);
    ScenarioBuilder scn22 = scenario("user22").exec(ws("WebSocket Connect").connect("/wss2/socket")).pause(120);
    ScenarioBuilder scn23 = scenario("user23").exec(ws("WebSocket Connect").connect("/wss2/socket")).pause(120);
    ScenarioBuilder scn24 = scenario("user24").exec(ws("WebSocket Connect").connect("/wss2/socket")).pause(120);
    ScenarioBuilder scn25 = scenario("user25").exec(ws("WebSocket Connect").connect("/wss2/socket")).pause(120);
    ScenarioBuilder scn26 = scenario("user26").exec(ws("WebSocket Connect").connect("/wss2/socket")).pause(120);
    ScenarioBuilder scn27 = scenario("user27").exec(ws("WebSocket Connect").connect("/wss2/socket")).pause(120);
    ScenarioBuilder scn28 = scenario("user28").exec(ws("WebSocket Connect").connect("/wss2/socket")).pause(120);
    ScenarioBuilder scn29 = scenario("user29").exec(ws("WebSocket Connect").connect("/wss2/socket")).pause(120);
    ScenarioBuilder scn30 = scenario("user30").exec(ws("WebSocket Connect").connect("/wss2/socket")).pause(120);
    ScenarioBuilder scn31 = scenario("user31").exec(ws("WebSocket Connect").connect("/wss2/socket")).pause(120);
    ScenarioBuilder scn32 = scenario("user32").exec(ws("WebSocket Connect").connect("/wss2/socket")).pause(120);
    ScenarioBuilder scn33 = scenario("user33").exec(ws("WebSocket Connect").connect("/wss2/socket")).pause(120);
    ScenarioBuilder scn34 = scenario("user34").exec(ws("WebSocket Connect").connect("/wss2/socket")).pause(120);
    ScenarioBuilder scn35 = scenario("user35").exec(ws("WebSocket Connect").connect("/wss2/socket")).pause(120);
    ScenarioBuilder scn36 = scenario("user36").exec(ws("WebSocket Connect").connect("/wss2/socket")).pause(120);
    ScenarioBuilder scn37 = scenario("user37").exec(ws("WebSocket Connect").connect("/wss2/socket")).pause(120);
    ScenarioBuilder scn38 = scenario("user38").exec(ws("WebSocket Connect").connect("/wss2/socket")).pause(120);
    ScenarioBuilder scn39 = scenario("user39").exec(ws("WebSocket Connect").connect("/wss2/socket")).pause(120);
    ScenarioBuilder scn40 = scenario("user40").exec(ws("WebSocket Connect").connect("/wss2/socket")).pause(120);
    ScenarioBuilder scn41 = scenario("user41").exec(ws("WebSocket Connect").connect("/wss2/socket")).pause(120);
    ScenarioBuilder scn42 = scenario("user42").exec(ws("WebSocket Connect").connect("/wss2/socket")).pause(120);
    ScenarioBuilder scn43 = scenario("user43").exec(ws("WebSocket Connect").connect("/wss2/socket")).pause(120);
    ScenarioBuilder scn44 = scenario("user44").exec(ws("WebSocket Connect").connect("/wss2/socket")).pause(120);
    ScenarioBuilder scn45 = scenario("user45").exec(ws("WebSocket Connect").connect("/wss2/socket")).pause(120);
    ScenarioBuilder scn46 = scenario("user46").exec(ws("WebSocket Connect").connect("/wss2/socket")).pause(120);
    ScenarioBuilder scn47 = scenario("user47").exec(ws("WebSocket Connect").connect("/wss2/socket")).pause(120);
    ScenarioBuilder scn48 = scenario("user48").exec(ws("WebSocket Connect").connect("/wss2/socket")).pause(120);
    ScenarioBuilder scn49 = scenario("user49").exec(ws("WebSocket Connect").connect("/wss2/socket")).pause(120);
    ScenarioBuilder scn50 = scenario("user50").exec(ws("WebSocket Connect").connect("/wss2/socket")).pause(120);
    ScenarioBuilder scn51 = scenario("user51").exec(ws("WebSocket Connect").connect("/wss2/socket")).pause(120);
    ScenarioBuilder scn52 = scenario("user52").exec(ws("WebSocket Connect").connect("/wss2/socket")).pause(120);
    ScenarioBuilder scn53 = scenario("user53").exec(ws("WebSocket Connect").connect("/wss2/socket")).pause(120);
    ScenarioBuilder scn54 = scenario("user54").exec(ws("WebSocket Connect").connect("/wss2/socket")).pause(120);
    ScenarioBuilder scn55 = scenario("user55").exec(ws("WebSocket Connect").connect("/wss2/socket")).pause(120);
    ScenarioBuilder scn56 = scenario("user56").exec(ws("WebSocket Connect").connect("/wss2/socket")).pause(120);
    ScenarioBuilder scn57 = scenario("user57").exec(ws("WebSocket Connect").connect("/wss2/socket")).pause(120);
    ScenarioBuilder scn58 = scenario("user58").exec(ws("WebSocket Connect").connect("/wss2/socket")).pause(120);
    ScenarioBuilder scn59 = scenario("user59").exec(ws("WebSocket Connect").connect("/wss2/socket")).pause(120);
    ScenarioBuilder scn60 = scenario("user60").exec(ws("WebSocket Connect").connect("/wss2/socket")).pause(120);
    ScenarioBuilder scn61 = scenario("user61").exec(ws("WebSocket Connect").connect("/wss2/socket")).pause(120);
    ScenarioBuilder scn62 = scenario("user62").exec(ws("WebSocket Connect").connect("/wss2/socket")).pause(120);
    ScenarioBuilder scn63 = scenario("user63").exec(ws("WebSocket Connect").connect("/wss2/socket")).pause(120);
    ScenarioBuilder scn64 = scenario("user64").exec(ws("WebSocket Connect").connect("/wss2/socket")).pause(120);
    ScenarioBuilder scn65 = scenario("user65").exec(ws("WebSocket Connect").connect("/wss2/socket")).pause(120);
    ScenarioBuilder scn66 = scenario("user66").exec(ws("WebSocket Connect").connect("/wss2/socket")).pause(120);
    ScenarioBuilder scn67 = scenario("user67").exec(ws("WebSocket Connect").connect("/wss2/socket")).pause(120);
    ScenarioBuilder scn68 = scenario("user68").exec(ws("WebSocket Connect").connect("/wss2/socket")).pause(120);
    ScenarioBuilder scn69 = scenario("user69").exec(ws("WebSocket Connect").connect("/wss2/socket")).pause(120);
    ScenarioBuilder scn70 = scenario("user70").exec(ws("WebSocket Connect").connect("/wss2/socket")).pause(120);
    ScenarioBuilder scn71 = scenario("user71").exec(ws("WebSocket Connect").connect("/wss2/socket")).pause(120);
    ScenarioBuilder scn72 = scenario("user72").exec(ws("WebSocket Connect").connect("/wss2/socket")).pause(120);
    ScenarioBuilder scn73 = scenario("user73").exec(ws("WebSocket Connect").connect("/wss2/socket")).pause(120);
    ScenarioBuilder scn74 = scenario("user74").exec(ws("WebSocket Connect").connect("/wss2/socket")).pause(120);
    ScenarioBuilder scn75 = scenario("user75").exec(ws("WebSocket Connect").connect("/wss2/socket")).pause(120);
    ScenarioBuilder scn76 = scenario("user76").exec(ws("WebSocket Connect").connect("/wss2/socket")).pause(120);
    ScenarioBuilder scn77 = scenario("user77").exec(ws("WebSocket Connect").connect("/wss2/socket")).pause(120);
    ScenarioBuilder scn78 = scenario("user78").exec(ws("WebSocket Connect").connect("/wss2/socket")).pause(120);
    ScenarioBuilder scn79 = scenario("user79").exec(ws("WebSocket Connect").connect("/wss2/socket")).pause(120);
    ScenarioBuilder scn80 = scenario("user80").exec(ws("WebSocket Connect").connect("/wss2/socket")).pause(120);
    ScenarioBuilder scn81 = scenario("user81").exec(ws("WebSocket Connect").connect("/wss2/socket")).pause(120);
    ScenarioBuilder scn82 = scenario("user82").exec(ws("WebSocket Connect").connect("/wss2/socket")).pause(120);
    ScenarioBuilder scn83 = scenario("user83").exec(ws("WebSocket Connect").connect("/wss2/socket")).pause(120);
    ScenarioBuilder scn84 = scenario("user84").exec(ws("WebSocket Connect").connect("/wss2/socket")).pause(120);
    ScenarioBuilder scn85 = scenario("user85").exec(ws("WebSocket Connect").connect("/wss2/socket")).pause(120);
    ScenarioBuilder scn86 = scenario("user86").exec(ws("WebSocket Connect").connect("/wss2/socket")).pause(120);
    ScenarioBuilder scn87 = scenario("user87").exec(ws("WebSocket Connect").connect("/wss2/socket")).pause(120);
    ScenarioBuilder scn88 = scenario("user88").exec(ws("WebSocket Connect").connect("/wss2/socket")).pause(120);
    ScenarioBuilder scn89 = scenario("user89").exec(ws("WebSocket Connect").connect("/wss2/socket")).pause(120);
    ScenarioBuilder scn90 = scenario("user90").exec(ws("WebSocket Connect").connect("/wss2/socket")).pause(120);
    ScenarioBuilder scn91 = scenario("user91").exec(ws("WebSocket Connect").connect("/wss2/socket")).pause(120);
    ScenarioBuilder scn92 = scenario("user92").exec(ws("WebSocket Connect").connect("/wss2/socket")).pause(120);
    ScenarioBuilder scn93 = scenario("user93").exec(ws("WebSocket Connect").connect("/wss2/socket")).pause(120);
    ScenarioBuilder scn94 = scenario("user94").exec(ws("WebSocket Connect").connect("/wss2/socket")).pause(120);
    ScenarioBuilder scn95 = scenario("user95").exec(ws("WebSocket Connect").connect("/wss2/socket")).pause(120);
    ScenarioBuilder scn96 = scenario("user96").exec(ws("WebSocket Connect").connect("/wss2/socket")).pause(120);
    ScenarioBuilder scn97 = scenario("user97").exec(ws("WebSocket Connect").connect("/wss2/socket")).pause(120);
    ScenarioBuilder scn98 = scenario("user98").exec(ws("WebSocket Connect").connect("/wss2/socket")).pause(120);
    ScenarioBuilder scn99 = scenario("user99").exec(ws("WebSocket Connect").connect("/wss2/socket")).pause(120);
    ScenarioBuilder scn100 = scenario("user100").exec(ws("WebSocket Connect").connect("/wss2/socket")).pause(120);

            {

                setUp(
                        scn0.injectOpen(atOnceUsers(1)).protocols(httpProtocol0),
                        scn1.injectOpen(atOnceUsers(1)).protocols(httpProtocol1),
                        scn2.injectOpen(atOnceUsers(1)).protocols(httpProtocol2),
                        scn3.injectOpen(atOnceUsers(1)).protocols(httpProtocol3),
                        scn4.injectOpen(atOnceUsers(1)).protocols(httpProtocol4),
                        scn5.injectOpen(atOnceUsers(1)).protocols(httpProtocol5)
                );
            }
        }


