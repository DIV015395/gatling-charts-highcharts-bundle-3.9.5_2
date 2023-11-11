var stats = {
    type: "GROUP",
name: "All Requests",
path: "",
pathFormatted: "group_missing-name-b06d1",
stats: {
    "name": "All Requests",
    "numberOfRequests": {
        "total": "20",
        "ok": "10",
        "ko": "10"
    },
    "minResponseTime": {
        "total": "81",
        "ok": "141",
        "ko": "81"
    },
    "maxResponseTime": {
        "total": "563",
        "ok": "563",
        "ko": "151"
    },
    "meanResponseTime": {
        "total": "158",
        "ok": "210",
        "ko": "106"
    },
    "standardDeviation": {
        "total": "101",
        "ok": "120",
        "ko": "22"
    },
    "percentiles1": {
        "total": "141",
        "ok": "174",
        "ko": "100"
    },
    "percentiles2": {
        "total": "172",
        "ok": "199",
        "ko": "123"
    },
    "percentiles3": {
        "total": "221",
        "ok": "401",
        "ko": "139"
    },
    "percentiles4": {
        "total": "495",
        "ok": "531",
        "ko": "149"
    },
    "group1": {
    "name": "t < 800 ms",
    "htmlName": "t < 800 ms",
    "count": 10,
    "percentage": 50
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
    "count": 10,
    "percentage": 50
},
    "meanNumberOfRequestsPerSecond": {
        "total": "0.159",
        "ok": "0.079",
        "ko": "0.079"
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
        "total": "10",
        "ok": "10",
        "ko": "0"
    },
    "minResponseTime": {
        "total": "141",
        "ok": "141",
        "ko": "-"
    },
    "maxResponseTime": {
        "total": "563",
        "ok": "563",
        "ko": "-"
    },
    "meanResponseTime": {
        "total": "210",
        "ok": "210",
        "ko": "-"
    },
    "standardDeviation": {
        "total": "120",
        "ok": "120",
        "ko": "-"
    },
    "percentiles1": {
        "total": "174",
        "ok": "174",
        "ko": "-"
    },
    "percentiles2": {
        "total": "199",
        "ok": "199",
        "ko": "-"
    },
    "percentiles3": {
        "total": "401",
        "ok": "401",
        "ko": "-"
    },
    "percentiles4": {
        "total": "531",
        "ok": "531",
        "ko": "-"
    },
    "group1": {
    "name": "t < 800 ms",
    "htmlName": "t < 800 ms",
    "count": 10,
    "percentage": 100
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
    "count": 0,
    "percentage": 0
},
    "meanNumberOfRequestsPerSecond": {
        "total": "0.079",
        "ok": "0.079",
        "ko": "-"
    }
}
    },"req_http-request-72f3d": {
        type: "REQUEST",
        name: "HTTP Request",
path: "HTTP Request",
pathFormatted: "req_http-request-72f3d",
stats: {
    "name": "HTTP Request",
    "numberOfRequests": {
        "total": "10",
        "ok": "0",
        "ko": "10"
    },
    "minResponseTime": {
        "total": "81",
        "ok": "-",
        "ko": "81"
    },
    "maxResponseTime": {
        "total": "151",
        "ok": "-",
        "ko": "151"
    },
    "meanResponseTime": {
        "total": "106",
        "ok": "-",
        "ko": "106"
    },
    "standardDeviation": {
        "total": "22",
        "ok": "-",
        "ko": "22"
    },
    "percentiles1": {
        "total": "100",
        "ok": "-",
        "ko": "100"
    },
    "percentiles2": {
        "total": "123",
        "ok": "-",
        "ko": "123"
    },
    "percentiles3": {
        "total": "139",
        "ok": "-",
        "ko": "139"
    },
    "percentiles4": {
        "total": "149",
        "ok": "-",
        "ko": "149"
    },
    "group1": {
    "name": "t < 800 ms",
    "htmlName": "t < 800 ms",
    "count": 0,
    "percentage": 0
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
    "count": 10,
    "percentage": 100
},
    "meanNumberOfRequestsPerSecond": {
        "total": "0.079",
        "ok": "-",
        "ko": "0.079"
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
