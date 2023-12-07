var stats = {
    type: "GROUP",
name: "All Requests",
path: "",
pathFormatted: "group_missing-name-b06d1",
stats: {
    "name": "All Requests",
    "numberOfRequests": {
        "total": "200",
        "ok": "60",
        "ko": "140"
    },
    "minResponseTime": {
        "total": "0",
        "ok": "0",
        "ko": "0"
    },
    "maxResponseTime": {
        "total": "10101",
        "ok": "10101",
        "ko": "10055"
    },
    "meanResponseTime": {
        "total": "4350",
        "ok": "2786",
        "ko": "5020"
    },
    "standardDeviation": {
        "total": "4865",
        "ok": "4076",
        "ko": "5020"
    },
    "percentiles1": {
        "total": "79",
        "ok": "79",
        "ko": "5018"
    },
    "percentiles2": {
        "total": "10038",
        "ok": "6602",
        "ko": "10038"
    },
    "percentiles3": {
        "total": "10054",
        "ok": "10092",
        "ko": "10040"
    },
    "percentiles4": {
        "total": "10096",
        "ok": "10098",
        "ko": "10055"
    },
    "group1": {
    "name": "t < 800 ms",
    "htmlName": "t < 800 ms",
    "count": 39,
    "percentage": 20
},
    "group2": {
    "name": "800 ms <= t < 1200 ms",
    "htmlName": "t >= 800 ms <br> t < 1200 ms",
    "count": 0,
    "percentage": 0
},
    "group3": {
    "name": "t >= 1200 ms",
    "htmlName": "t >= 1200 ms",
    "count": 21,
    "percentage": 11
},
    "group4": {
    "name": "failed",
    "htmlName": "failed",
    "count": 140,
    "percentage": 70
},
    "meanNumberOfRequestsPerSecond": {
        "total": "11.765",
        "ok": "3.529",
        "ko": "8.235"
    }
},
contents: {
"req_websocket-conne-b6a6d": {
        type: "REQUEST",
        name: "WebSocket Connect",
path: "WebSocket Connect",
pathFormatted: "req_websocket-conne-b6a6d",
stats: {
    "name": "WebSocket Connect",
    "numberOfRequests": {
        "total": "100",
        "ok": "30",
        "ko": "70"
    },
    "minResponseTime": {
        "total": "158",
        "ok": "158",
        "ko": "10036"
    },
    "maxResponseTime": {
        "total": "10101",
        "ok": "10101",
        "ko": "10055"
    },
    "meanResponseTime": {
        "total": "8699",
        "ok": "5571",
        "ko": "10039"
    },
    "standardDeviation": {
        "total": "3083",
        "ok": "4208",
        "ko": "4"
    },
    "percentiles1": {
        "total": "10038",
        "ok": "6847",
        "ko": "10038"
    },
    "percentiles2": {
        "total": "10039",
        "ok": "9871",
        "ko": "10039"
    },
    "percentiles3": {
        "total": "10082",
        "ok": "10096",
        "ko": "10053"
    },
    "percentiles4": {
        "total": "10096",
        "ok": "10100",
        "ko": "10055"
    },
    "group1": {
    "name": "t < 800 ms",
    "htmlName": "t < 800 ms",
    "count": 9,
    "percentage": 9
},
    "group2": {
    "name": "800 ms <= t < 1200 ms",
    "htmlName": "t >= 800 ms <br> t < 1200 ms",
    "count": 0,
    "percentage": 0
},
    "group3": {
    "name": "t >= 1200 ms",
    "htmlName": "t >= 1200 ms",
    "count": 21,
    "percentage": 21
},
    "group4": {
    "name": "failed",
    "htmlName": "failed",
    "count": 70,
    "percentage": 70
},
    "meanNumberOfRequestsPerSecond": {
        "total": "5.882",
        "ok": "1.765",
        "ko": "4.118"
    }
}
    },"req_send-request-ty-e20e2": {
        type: "REQUEST",
        name: "Send Request type in Websocket",
path: "Send Request type in Websocket",
pathFormatted: "req_send-request-ty-e20e2",
stats: {
    "name": "Send Request type in Websocket",
    "numberOfRequests": {
        "total": "100",
        "ok": "30",
        "ko": "70"
    },
    "minResponseTime": {
        "total": "0",
        "ok": "0",
        "ko": "0"
    },
    "maxResponseTime": {
        "total": "0",
        "ok": "0",
        "ko": "0"
    },
    "meanResponseTime": {
        "total": "0",
        "ok": "0",
        "ko": "0"
    },
    "standardDeviation": {
        "total": "0",
        "ok": "0",
        "ko": "0"
    },
    "percentiles1": {
        "total": "0",
        "ok": "0",
        "ko": "0"
    },
    "percentiles2": {
        "total": "0",
        "ok": "0",
        "ko": "0"
    },
    "percentiles3": {
        "total": "0",
        "ok": "0",
        "ko": "0"
    },
    "percentiles4": {
        "total": "0",
        "ok": "0",
        "ko": "0"
    },
    "group1": {
    "name": "t < 800 ms",
    "htmlName": "t < 800 ms",
    "count": 30,
    "percentage": 30
},
    "group2": {
    "name": "800 ms <= t < 1200 ms",
    "htmlName": "t >= 800 ms <br> t < 1200 ms",
    "count": 0,
    "percentage": 0
},
    "group3": {
    "name": "t >= 1200 ms",
    "htmlName": "t >= 1200 ms",
    "count": 0,
    "percentage": 0
},
    "group4": {
    "name": "failed",
    "htmlName": "failed",
    "count": 70,
    "percentage": 70
},
    "meanNumberOfRequestsPerSecond": {
        "total": "5.882",
        "ok": "1.765",
        "ko": "4.118"
    }
}
    }
}

}

function fillStats(stat){
    $("#numberOfRequests").append(stat.numberOfRequests.total);
    $("#numberOfRequestsOK").append(stat.numberOfRequests.ok);
    $("#numberOfRequestsKO").append(stat.numberOfRequests.ko);

    $("#minResponseTime").append(stat.minResponseTime.total);
    $("#minResponseTimeOK").append(stat.minResponseTime.ok);
    $("#minResponseTimeKO").append(stat.minResponseTime.ko);

    $("#maxResponseTime").append(stat.maxResponseTime.total);
    $("#maxResponseTimeOK").append(stat.maxResponseTime.ok);
    $("#maxResponseTimeKO").append(stat.maxResponseTime.ko);

    $("#meanResponseTime").append(stat.meanResponseTime.total);
    $("#meanResponseTimeOK").append(stat.meanResponseTime.ok);
    $("#meanResponseTimeKO").append(stat.meanResponseTime.ko);

    $("#standardDeviation").append(stat.standardDeviation.total);
    $("#standardDeviationOK").append(stat.standardDeviation.ok);
    $("#standardDeviationKO").append(stat.standardDeviation.ko);

    $("#percentiles1").append(stat.percentiles1.total);
    $("#percentiles1OK").append(stat.percentiles1.ok);
    $("#percentiles1KO").append(stat.percentiles1.ko);

    $("#percentiles2").append(stat.percentiles2.total);
    $("#percentiles2OK").append(stat.percentiles2.ok);
    $("#percentiles2KO").append(stat.percentiles2.ko);

    $("#percentiles3").append(stat.percentiles3.total);
    $("#percentiles3OK").append(stat.percentiles3.ok);
    $("#percentiles3KO").append(stat.percentiles3.ko);

    $("#percentiles4").append(stat.percentiles4.total);
    $("#percentiles4OK").append(stat.percentiles4.ok);
    $("#percentiles4KO").append(stat.percentiles4.ko);

    $("#meanNumberOfRequestsPerSecond").append(stat.meanNumberOfRequestsPerSecond.total);
    $("#meanNumberOfRequestsPerSecondOK").append(stat.meanNumberOfRequestsPerSecond.ok);
    $("#meanNumberOfRequestsPerSecondKO").append(stat.meanNumberOfRequestsPerSecond.ko);
}
