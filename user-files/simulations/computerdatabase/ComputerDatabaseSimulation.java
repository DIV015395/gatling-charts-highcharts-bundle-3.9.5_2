package computerdatabase;
import static io.gatling.javaapi.core.CoreDsl.*;
import static io.gatling.javaapi.http.HttpDsl.*;
import io.gatling.javaapi.core.*;
import io.gatling.javaapi.http.*;

public class ComputerDatabaseSimulation extends Simulation
{
     HttpProtocolBuilder httpProtocol0 = http
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
    HttpProtocolBuilder httpProtocol1 = http
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



    HttpProtocolBuilder httpProtocol2 = http
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



    HttpProtocolBuilder httpProtocol3 = http
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
    HttpProtocolBuilder httpProtocol4 = http
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



    HttpProtocolBuilder httpProtocol5 = http
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
    HttpProtocolBuilder httpProtocol6 = http
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

            ScenarioBuilder scn0 = scenario("user")
                    .exec(
                            ws("WebSocket Connect")
                                    .connect("/wss2/socket")
                    )
                    .pause(120); // Adjust as needed for your load testing scenario
//                    .exec(ws("WebSocket Close").close());

    ScenarioBuilder scn1 = scenario("user 2")
            .exec(
                    ws("WebSocket Connect")
                            .connect("/wss2/socket")
            )
            .pause(120); // Adjust as needed for your load testing scenario
//                    .exec(ws("WebSocket Close").close());
ScenarioBuilder scn2 = scenario("user 3")
        .exec(
                ws("WebSocket Connect")
                        .connect("/wss2/socket")
        )
        .pause(120); // Adjust as needed for your load testing scenario
//                    .exec(ws("WebSocket Close").close());

            {

                setUp(
                        scn0.injectOpen(atOnceUsers(1)).protocols(httpProtocol0),
                        scn1.injectOpen(atOnceUsers(1)).protocols(httpProtocol1),
                        scn2.injectOpen(atOnceUsers(1)).protocols(httpProtocol2)
                );
//        setUp(scn.injectOpen(atOnceUsers(1))).protocols(httpProtocol);
//        setUp(scn1.injectOpen(atOnceUsers(1))).protocols(httpProtocol1);
//        setUp(scn.injectOpen(atOnceUsers(1)),scn1.injectOpen(atOnceUsers(1)).protocols(httpProtocol));
            }
        }


