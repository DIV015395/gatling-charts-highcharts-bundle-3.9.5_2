var stats = {
    type: "GROUP",
name: "All Requests",
path: "",
pathFormatted: "group_missing-name-b06d1",
stats: {
    "name": "All Requests",
    "numberOfRequests": {
        "total": "340",
        "ok": "303",
        "ko": "37"
    },
    "minResponseTime": {
        "total": "0",
        "ok": "0",
        "ko": "0"
    },
    "maxResponseTime": {
        "total": "10130",
        "ok": "9450",
        "ko": "10130"
    },
    "meanResponseTime": {
        "total": "3279",
        "ok": "3112",
        "ko": "4651"
    },
    "standardDeviation": {
        "total": "3769",
        "ok": "3546",
        "ko": "5045"
    },
    "percentiles1": {
        "total": "131",
        "ok": "211",
        "ko": "0"
    },
    "percentiles2": {
        "total": "7080",
        "ok": "6939",
        "ko": "10125"
    },
    "percentiles3": {
        "total": "9483",
        "ok": "8607",
        "ko": "10129"
    },
    "percentiles4": {
        "total": "10129",
        "ok": "9405",
        "ko": "10130"
    },
    "group1": {
    "name": "t < 800 ms",
    "htmlName": "t < 800 ms",
    "count": 161,
    "percentage": 47
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
    "count": 142,
    "percentage": 42
},
    "group4": {
    "name": "failed",
    "htmlName": "failed",
    "count": 37,
    "percentage": 11
},
    "meanNumberOfRequestsPerSecond": {
        "total": "13.077",
        "ok": "11.654",
        "ko": "1.423"
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
        "total": "170",
        "ok": "153",
        "ko": "17"
    },
    "minResponseTime": {
        "total": "175",
        "ok": "175",
        "ko": "10106"
    },
    "maxResponseTime": {
        "total": "10130",
        "ok": "9450",
        "ko": "10130"
    },
    "meanResponseTime": {
        "total": "6559",
        "ok": "6163",
        "ko": "10123"
    },
    "standardDeviation": {
        "total": "2627",
        "ok": "2469",
        "ko": "7"
    },
    "percentiles1": {
        "total": "7081",
        "ok": "6929",
        "ko": "10126"
    },
    "percentiles2": {
        "total": "8596",
        "ok": "8259",
        "ko": "10129"
    },
    "percentiles3": {
        "total": "10126",
        "ok": "9362",
        "ko": "10130"
    },
    "percentiles4": {
        "total": "10129",
        "ok": "9418",
        "ko": "10130"
    },
    "group1": {
    "name": "t < 800 ms",
    "htmlName": "t < 800 ms",
    "count": 11,
    "percentage": 6
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
    "count": 142,
    "percentage": 84
},
    "group4": {
    "name": "failed",
    "htmlName": "failed",
    "count": 17,
    "percentage": 10
},
    "meanNumberOfRequestsPerSecond": {
        "total": "6.538",
        "ok": "5.885",
        "ko": "0.654"
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
        "total": "170",
        "ok": "150",
        "ko": "20"
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
    "count": 150,
    "percentage": 88
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
    "count": 20,
    "percentage": 12
},
    "meanNumberOfRequestsPerSecond": {
        "total": "6.538",
        "ok": "5.769",
        "ko": "0.769"
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
