var stats = {
    type: "GROUP",
name: "All Requests",
path: "",
pathFormatted: "group_missing-name-b06d1",
stats: {
    "name": "All Requests",
    "numberOfRequests": {
        "total": "500",
        "ok": "316",
        "ko": "184"
    },
    "minResponseTime": {
        "total": "215",
        "ok": "215",
        "ko": "10046"
    },
    "maxResponseTime": {
        "total": "10466",
        "ok": "8507",
        "ko": "10466"
    },
    "meanResponseTime": {
        "total": "7099",
        "ok": "5322",
        "ko": "10151"
    },
    "standardDeviation": {
        "total": "3258",
        "ok": "2865",
        "ko": "101"
    },
    "percentiles1": {
        "total": "7582",
        "ok": "6431",
        "ko": "10105"
    },
    "percentiles2": {
        "total": "10084",
        "ok": "7530",
        "ko": "10208"
    },
    "percentiles3": {
        "total": "10294",
        "ok": "8296",
        "ko": "10335"
    },
    "percentiles4": {
        "total": "10413",
        "ok": "8447",
        "ko": "10451"
    },
    "group1": {
    "name": "t < 800 ms",
    "htmlName": "t < 800 ms",
    "count": 60,
    "percentage": 12
},
    "group2": {
    "name": "800 ms <= t < 1200 ms",
    "htmlName": "t >= 800 ms <br> t < 1200 ms",
    "count": 12,
    "percentage": 2
},
    "group3": {
    "name": "t >= 1200 ms",
    "htmlName": "t >= 1200 ms",
    "count": 244,
    "percentage": 49
},
    "group4": {
    "name": "failed",
    "htmlName": "failed",
    "count": 184,
    "percentage": 37
},
    "meanNumberOfRequestsPerSecond": {
        "total": "3.817",
        "ok": "2.412",
        "ko": "1.405"
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
        "total": "500",
        "ok": "316",
        "ko": "184"
    },
    "minResponseTime": {
        "total": "215",
        "ok": "215",
        "ko": "10046"
    },
    "maxResponseTime": {
        "total": "10466",
        "ok": "8507",
        "ko": "10466"
    },
    "meanResponseTime": {
        "total": "7099",
        "ok": "5322",
        "ko": "10151"
    },
    "standardDeviation": {
        "total": "3258",
        "ok": "2865",
        "ko": "101"
    },
    "percentiles1": {
        "total": "7582",
        "ok": "6431",
        "ko": "10105"
    },
    "percentiles2": {
        "total": "10084",
        "ok": "7530",
        "ko": "10208"
    },
    "percentiles3": {
        "total": "10294",
        "ok": "8296",
        "ko": "10335"
    },
    "percentiles4": {
        "total": "10413",
        "ok": "8447",
        "ko": "10451"
    },
    "group1": {
    "name": "t < 800 ms",
    "htmlName": "t < 800 ms",
    "count": 60,
    "percentage": 12
},
    "group2": {
    "name": "800 ms <= t < 1200 ms",
    "htmlName": "t >= 800 ms <br> t < 1200 ms",
    "count": 12,
    "percentage": 2
},
    "group3": {
    "name": "t >= 1200 ms",
    "htmlName": "t >= 1200 ms",
    "count": 244,
    "percentage": 49
},
    "group4": {
    "name": "failed",
    "htmlName": "failed",
    "count": 184,
    "percentage": 37
},
    "meanNumberOfRequestsPerSecond": {
        "total": "3.817",
        "ok": "2.412",
        "ko": "1.405"
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
