var stats = {
    type: "GROUP",
name: "All Requests",
path: "",
pathFormatted: "group_missing-name-b06d1",
stats: {
    "name": "All Requests",
    "numberOfRequests": {
        "total": "150",
        "ok": "149",
        "ko": "1"
    },
    "minResponseTime": {
        "total": "207",
        "ok": "207",
        "ko": "11097"
    },
    "maxResponseTime": {
        "total": "11097",
        "ok": "9912",
        "ko": "11097"
    },
    "meanResponseTime": {
        "total": "6075",
        "ok": "6041",
        "ko": "11097"
    },
    "standardDeviation": {
        "total": "2411",
        "ok": "2384",
        "ko": "0"
    },
    "percentiles1": {
        "total": "6793",
        "ok": "6777",
        "ko": "11097"
    },
    "percentiles2": {
        "total": "8095",
        "ok": "8092",
        "ko": "11097"
    },
    "percentiles3": {
        "total": "9254",
        "ok": "9242",
        "ko": "11097"
    },
    "percentiles4": {
        "total": "9660",
        "ok": "9348",
        "ko": "11097"
    },
    "group1": {
    "name": "t < 800 ms",
    "htmlName": "t < 800 ms",
    "count": 11,
    "percentage": 7
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
    "count": 138,
    "percentage": 92
},
    "group4": {
    "name": "failed",
    "htmlName": "failed",
    "count": 1,
    "percentage": 1
},
    "meanNumberOfRequestsPerSecond": {
        "total": "6.818",
        "ok": "6.773",
        "ko": "0.045"
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
        "total": "150",
        "ok": "149",
        "ko": "1"
    },
    "minResponseTime": {
        "total": "207",
        "ok": "207",
        "ko": "11097"
    },
    "maxResponseTime": {
        "total": "11097",
        "ok": "9912",
        "ko": "11097"
    },
    "meanResponseTime": {
        "total": "6075",
        "ok": "6041",
        "ko": "11097"
    },
    "standardDeviation": {
        "total": "2411",
        "ok": "2384",
        "ko": "0"
    },
    "percentiles1": {
        "total": "6793",
        "ok": "6777",
        "ko": "11097"
    },
    "percentiles2": {
        "total": "8095",
        "ok": "8092",
        "ko": "11097"
    },
    "percentiles3": {
        "total": "9254",
        "ok": "9242",
        "ko": "11097"
    },
    "percentiles4": {
        "total": "9660",
        "ok": "9348",
        "ko": "11097"
    },
    "group1": {
    "name": "t < 800 ms",
    "htmlName": "t < 800 ms",
    "count": 11,
    "percentage": 7
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
    "count": 138,
    "percentage": 92
},
    "group4": {
    "name": "failed",
    "htmlName": "failed",
    "count": 1,
    "percentage": 1
},
    "meanNumberOfRequestsPerSecond": {
        "total": "6.818",
        "ok": "6.773",
        "ko": "0.045"
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
