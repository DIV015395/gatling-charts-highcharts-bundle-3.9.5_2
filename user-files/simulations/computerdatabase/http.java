//package computerdatabase;
//
//import io.gatling.core.structure.ScenarioBuilder;
//import io.gatling.http.protocol.HttpProtocolBuilder;
//import io.gatling.javaapi.core.FeederBuilder;
//import io.gatling.javaapi.core.Simulation;
//
//import static io.gatling.javaapi.core.CoreDsl.csv;
//import static io.gatling.javaapi.core.CoreDsl.scenario;
//
//public class http extends Simulation {
//
//    FeederBuilder<String> datas = csv("data (1).csv").circular();
//
//        HttpProtocolBuilder httpMessageSender = http
//            .baseUrl("https://chatdv.clovedental.in") // Correct HTTPS base URL
//            .header("X-APP-VERSION", "IOS_v3.2.0")
//            .header("Content-Type", "application/json");
//    ScenarioBuilder scnMessage= scenario("Sending Chat")
//            .feed(datas)  // Use 'feed' to inject data from the feeder
//            .exec(new http("HTTP Request")
//                    .post("/cometchat_send.php")
//                    .formParam("basedata", "${basedata}")
//                    .formParam("deviceId", "${deviceid}")
//                    .formParam("file_url", "")
//                    .formParam("localmessageid", "34848584")
//                    .formParam("msg_type", "10")
//                    .formParam("to", "12")
//                    .formParam("message", "M.S. Gatling")
//            ).pause(5);
//}
