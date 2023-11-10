var stats = {
    type: "GROUP",
name: "All Requests",
path: "",
pathFormatted: "group_missing-name-b06d1",
stats: {
    "name": "All Requests",
    "numberOfRequests": {
        "total": "152",
        "ok": "150",
        "ko": "2"
    },
    "minResponseTime": {
        "total": "239",
        "ok": "239",
        "ko": "10138"
    },
    "maxResponseTime": {
        "total": "10142",
        "ok": "9987",
        "ko": "10142"
    },
    "meanResponseTime": {
        "total": "6625",
        "ok": "6578",
        "ko": "10140"
    },
    "standardDeviation": {
        "total": "2502",
        "ok": "2485",
        "ko": "2"
    },
    "percentiles1": {
        "total": "7331",
        "ok": "7322",
        "ko": "10140"
    },
    "percentiles2": {
        "total": "8720",
        "ok": "8702",
        "ko": "10141"
    },
    "percentiles3": {
        "total": "9901",
        "ok": "9865",
        "ko": "10142"
    },
    "percentiles4": {
        "total": "10061",
        "ok": "9956",
        "ko": "10142"
    },
    "group1": {
    "name": "t < 800 ms",
    "htmlName": "t < 800 ms",
    "count": 10,
    "percentage": 7
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
    "count": 139,
    "percentage": 91
},
    "group4": {
    "name": "failed",
    "htmlName": "failed",
    "count": 2,
    "percentage": 1
},
    "meanNumberOfRequestsPerSecond": {
        "total": "1.16",
        "ok": "1.145",
        "ko": "0.015"
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
        "total": "152",
        "ok": "150",
        "ko": "2"
    },
    "minResponseTime": {
        "total": "239",
        "ok": "239",
        "ko": "10138"
    },
    "maxResponseTime": {
        "total": "10142",
        "ok": "9987",
        "ko": "10142"
    },
    "meanResponseTime": {
        "total": "6625",
        "ok": "6578",
        "ko": "10140"
    },
    "standardDeviation": {
        "total": "2502",
        "ok": "2485",
        "ko": "2"
    },
    "percentiles1": {
        "total": "7331",
        "ok": "7322",
        "ko": "10140"
    },
    "percentiles2": {
        "total": "8720",
        "ok": "8702",
        "ko": "10141"
    },
    "percentiles3": {
        "total": "9901",
        "ok": "9865",
        "ko": "10142"
    },
    "percentiles4": {
        "total": "10061",
        "ok": "9956",
        "ko": "10142"
    },
    "group1": {
    "name": "t < 800 ms",
    "htmlName": "t < 800 ms",
    "count": 10,
    "percentage": 7
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
    "count": 139,
    "percentage": 91
},
    "group4": {
    "name": "failed",
    "htmlName": "failed",
    "count": 2,
    "percentage": 1
},
    "meanNumberOfRequestsPerSecond": {
        "total": "1.16",
        "ok": "1.145",
        "ko": "0.015"
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
