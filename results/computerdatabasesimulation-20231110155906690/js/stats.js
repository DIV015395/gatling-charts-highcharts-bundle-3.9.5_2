var stats = {
    type: "GROUP",
name: "All Requests",
path: "",
pathFormatted: "group_missing-name-b06d1",
stats: {
    "name": "All Requests",
    "numberOfRequests": {
        "total": "100",
        "ok": "50",
        "ko": "50"
    },
    "minResponseTime": {
        "total": "127",
        "ok": "145",
        "ko": "127"
    },
    "maxResponseTime": {
        "total": "6041",
        "ok": "6041",
        "ko": "421"
    },
    "meanResponseTime": {
        "total": "1968",
        "ok": "3660",
        "ko": "276"
    },
    "standardDeviation": {
        "total": "2256",
        "ok": "2109",
        "ko": "87"
    },
    "percentiles1": {
        "total": "349",
        "ok": "4146",
        "ko": "281"
    },
    "percentiles2": {
        "total": "4143",
        "ok": "5158",
        "ko": "344"
    },
    "percentiles3": {
        "total": "6006",
        "ok": "6037",
        "ko": "408"
    },
    "percentiles4": {
        "total": "6041",
        "ok": "6041",
        "ko": "417"
    },
    "group1": {
    "name": "t < 800 ms",
    "htmlName": "t < 800 ms",
    "count": 11,
    "percentage": 11
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
    "count": 38,
    "percentage": 38
},
    "group4": {
    "name": "failed",
    "htmlName": "failed",
    "count": 50,
    "percentage": 50
},
    "meanNumberOfRequestsPerSecond": {
        "total": "0.781",
        "ok": "0.391",
        "ko": "0.391"
    }
},
contents: {
"req_http-request-72f3d": {
        type: "REQUEST",
        name: "HTTP Request",
path: "HTTP Request",
pathFormatted: "req_http-request-72f3d",
stats: {
    "name": "HTTP Request",
    "numberOfRequests": {
        "total": "50",
        "ok": "0",
        "ko": "50"
    },
    "minResponseTime": {
        "total": "127",
        "ok": "-",
        "ko": "127"
    },
    "maxResponseTime": {
        "total": "421",
        "ok": "-",
        "ko": "421"
    },
    "meanResponseTime": {
        "total": "276",
        "ok": "-",
        "ko": "276"
    },
    "standardDeviation": {
        "total": "87",
        "ok": "-",
        "ko": "87"
    },
    "percentiles1": {
        "total": "281",
        "ok": "-",
        "ko": "281"
    },
    "percentiles2": {
        "total": "344",
        "ok": "-",
        "ko": "344"
    },
    "percentiles3": {
        "total": "408",
        "ok": "-",
        "ko": "408"
    },
    "percentiles4": {
        "total": "417",
        "ok": "-",
        "ko": "417"
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
    "count": 50,
    "percentage": 100
},
    "meanNumberOfRequestsPerSecond": {
        "total": "0.391",
        "ok": "-",
        "ko": "0.391"
    }
}
    },"req_websocket-conne-b6a6d": {
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
        "total": "145",
        "ok": "145",
        "ko": "-"
    },
    "maxResponseTime": {
        "total": "6041",
        "ok": "6041",
        "ko": "-"
    },
    "meanResponseTime": {
        "total": "3660",
        "ok": "3660",
        "ko": "-"
    },
    "standardDeviation": {
        "total": "2109",
        "ok": "2109",
        "ko": "-"
    },
    "percentiles1": {
        "total": "4146",
        "ok": "4146",
        "ko": "-"
    },
    "percentiles2": {
        "total": "5158",
        "ok": "5158",
        "ko": "-"
    },
    "percentiles3": {
        "total": "6037",
        "ok": "6037",
        "ko": "-"
    },
    "percentiles4": {
        "total": "6041",
        "ok": "6041",
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
    "count": 1,
    "percentage": 2
},
    "group3": {
    "name": "t >= 1200 ms",
    "htmlName": "t >= 1200 ms",
    "count": 38,
    "percentage": 76
},
    "group4": {
    "name": "failed",
    "htmlName": "failed",
    "count": 0,
    "percentage": 0
},
    "meanNumberOfRequestsPerSecond": {
        "total": "0.391",
        "ok": "0.391",
        "ko": "-"
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
