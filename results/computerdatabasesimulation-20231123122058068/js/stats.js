var stats = {
    type: "GROUP",
name: "All Requests",
path: "",
pathFormatted: "group_missing-name-b06d1",
stats: {
    "name": "All Requests",
    "numberOfRequests": {
        "total": "100",
        "ok": "99",
        "ko": "1"
    },
    "minResponseTime": {
        "total": "0",
        "ok": "0",
        "ko": "0"
    },
    "maxResponseTime": {
        "total": "6675",
        "ok": "6675",
        "ko": "0"
    },
    "meanResponseTime": {
        "total": "2190",
        "ok": "2212",
        "ko": "0"
    },
    "standardDeviation": {
        "total": "2662",
        "ok": "2666",
        "ko": "0"
    },
    "percentiles1": {
        "total": "165",
        "ok": "330",
        "ko": "0"
    },
    "percentiles2": {
        "total": "5223",
        "ok": "5226",
        "ko": "0"
    },
    "percentiles3": {
        "total": "6259",
        "ok": "6260",
        "ko": "0"
    },
    "percentiles4": {
        "total": "6643",
        "ok": "6644",
        "ko": "0"
    },
    "group1": {
    "name": "t < 800 ms",
    "htmlName": "t < 800 ms",
    "count": 58,
    "percentage": 58
},
    "group2": {
    "name": "800 ms <= t < 1200 ms",
    "htmlName": "t >= 800 ms <br> t < 1200 ms",
    "count": 1,
    "percentage": 1
},
    "group3": {
    "name": "t >= 1200 ms",
    "htmlName": "t >= 1200 ms",
    "count": 40,
    "percentage": 40
},
    "group4": {
    "name": "failed",
    "htmlName": "failed",
    "count": 1,
    "percentage": 1
},
    "meanNumberOfRequestsPerSecond": {
        "total": "0.099",
        "ok": "0.098",
        "ko": "0.001"
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
        "total": "50",
        "ok": "50",
        "ko": "0"
    },
    "minResponseTime": {
        "total": "330",
        "ok": "330",
        "ko": "-"
    },
    "maxResponseTime": {
        "total": "6675",
        "ok": "6675",
        "ko": "-"
    },
    "meanResponseTime": {
        "total": "4381",
        "ok": "4381",
        "ko": "-"
    },
    "standardDeviation": {
        "total": "2139",
        "ok": "2139",
        "ko": "-"
    },
    "percentiles1": {
        "total": "5226",
        "ok": "5226",
        "ko": "-"
    },
    "percentiles2": {
        "total": "5350",
        "ok": "5350",
        "ko": "-"
    },
    "percentiles3": {
        "total": "6591",
        "ok": "6591",
        "ko": "-"
    },
    "percentiles4": {
        "total": "6659",
        "ok": "6659",
        "ko": "-"
    },
    "group1": {
    "name": "t < 800 ms",
    "htmlName": "t < 800 ms",
    "count": 9,
    "percentage": 18
},
    "group2": {
    "name": "800 ms <= t < 1200 ms",
    "htmlName": "t >= 800 ms <br> t < 1200 ms",
    "count": 1,
    "percentage": 2
},
    "group3": {
    "name": "t >= 1200 ms",
    "htmlName": "t >= 1200 ms",
    "count": 40,
    "percentage": 80
},
    "group4": {
    "name": "failed",
    "htmlName": "failed",
    "count": 0,
    "percentage": 0
},
    "meanNumberOfRequestsPerSecond": {
        "total": "0.05",
        "ok": "0.05",
        "ko": "-"
    }
}
    },"req_send-websocket--c1ba2": {
        type: "REQUEST",
        name: "Send WebSocket Request",
path: "Send WebSocket Request",
pathFormatted: "req_send-websocket--c1ba2",
stats: {
    "name": "Send WebSocket Request",
    "numberOfRequests": {
        "total": "50",
        "ok": "49",
        "ko": "1"
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
    "count": 49,
    "percentage": 98
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
    "count": 1,
    "percentage": 2
},
    "meanNumberOfRequestsPerSecond": {
        "total": "0.05",
        "ok": "0.049",
        "ko": "0.001"
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
