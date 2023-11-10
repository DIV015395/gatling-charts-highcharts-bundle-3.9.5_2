var stats = {
    type: "GROUP",
name: "All Requests",
path: "",
pathFormatted: "group_missing-name-b06d1",
stats: {
    "name": "All Requests",
    "numberOfRequests": {
        "total": "100",
        "ok": "98",
        "ko": "2"
    },
    "minResponseTime": {
        "total": "0",
        "ok": "0",
        "ko": "0"
    },
    "maxResponseTime": {
        "total": "5809",
        "ok": "5809",
        "ko": "0"
    },
    "meanResponseTime": {
        "total": "1737",
        "ok": "1772",
        "ko": "0"
    },
    "standardDeviation": {
        "total": "2217",
        "ok": "2225",
        "ko": "0"
    },
    "percentiles1": {
        "total": "103",
        "ok": "219",
        "ko": "0"
    },
    "percentiles2": {
        "total": "3787",
        "ok": "3794",
        "ko": "0"
    },
    "percentiles3": {
        "total": "5770",
        "ok": "5770",
        "ko": "0"
    },
    "percentiles4": {
        "total": "5802",
        "ok": "5802",
        "ko": "0"
    },
    "group1": {
    "name": "t < 800 ms",
    "htmlName": "t < 800 ms",
    "count": 59,
    "percentage": 59
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
    "count": 39,
    "percentage": 39
},
    "group4": {
    "name": "failed",
    "htmlName": "failed",
    "count": 2,
    "percentage": 2
},
    "meanNumberOfRequestsPerSecond": {
        "total": "0.794",
        "ok": "0.778",
        "ko": "0.016"
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
        "total": "206",
        "ok": "206",
        "ko": "-"
    },
    "maxResponseTime": {
        "total": "5809",
        "ok": "5809",
        "ko": "-"
    },
    "meanResponseTime": {
        "total": "3473",
        "ok": "3473",
        "ko": "-"
    },
    "standardDeviation": {
        "total": "1949",
        "ok": "1949",
        "ko": "-"
    },
    "percentiles1": {
        "total": "3791",
        "ok": "3791",
        "ko": "-"
    },
    "percentiles2": {
        "total": "4844",
        "ok": "4844",
        "ko": "-"
    },
    "percentiles3": {
        "total": "5788",
        "ok": "5788",
        "ko": "-"
    },
    "percentiles4": {
        "total": "5806",
        "ok": "5806",
        "ko": "-"
    },
    "group1": {
    "name": "t < 800 ms",
    "htmlName": "t < 800 ms",
    "count": 11,
    "percentage": 22
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
    "count": 39,
    "percentage": 78
},
    "group4": {
    "name": "failed",
    "htmlName": "failed",
    "count": 0,
    "percentage": 0
},
    "meanNumberOfRequestsPerSecond": {
        "total": "0.397",
        "ok": "0.397",
        "ko": "-"
    }
}
    },"req_send-hello-mess-efdb3": {
        type: "REQUEST",
        name: "Send Hello Message",
path: "Send Hello Message",
pathFormatted: "req_send-hello-mess-efdb3",
stats: {
    "name": "Send Hello Message",
    "numberOfRequests": {
        "total": "50",
        "ok": "48",
        "ko": "2"
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
    "count": 48,
    "percentage": 96
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
    "count": 2,
    "percentage": 4
},
    "meanNumberOfRequestsPerSecond": {
        "total": "0.397",
        "ok": "0.381",
        "ko": "0.016"
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
