var stats = {
    type: "GROUP",
name: "All Requests",
path: "",
pathFormatted: "group_missing-name-b06d1",
stats: {
    "name": "All Requests",
    "numberOfRequests": {
        "total": "200",
        "ok": "189",
        "ko": "11"
    },
    "minResponseTime": {
        "total": "336",
        "ok": "336",
        "ko": "10084"
    },
    "maxResponseTime": {
        "total": "10172",
        "ok": "9509",
        "ko": "10172"
    },
    "meanResponseTime": {
        "total": "6214",
        "ok": "5986",
        "ko": "10133"
    },
    "standardDeviation": {
        "total": "2238",
        "ok": "2086",
        "ko": "35"
    },
    "percentiles1": {
        "total": "6248",
        "ok": "6193",
        "ko": "10160"
    },
    "percentiles2": {
        "total": "7795",
        "ok": "6932",
        "ko": "10165"
    },
    "percentiles3": {
        "total": "10085",
        "ok": "8884",
        "ko": "10169"
    },
    "percentiles4": {
        "total": "10165",
        "ok": "9492",
        "ko": "10171"
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
    "count": 178,
    "percentage": 89
},
    "group4": {
    "name": "failed",
    "htmlName": "failed",
    "count": 11,
    "percentage": 6
},
    "meanNumberOfRequestsPerSecond": {
        "total": "1.527",
        "ok": "1.443",
        "ko": "0.084"
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
        "total": "200",
        "ok": "189",
        "ko": "11"
    },
    "minResponseTime": {
        "total": "336",
        "ok": "336",
        "ko": "10084"
    },
    "maxResponseTime": {
        "total": "10172",
        "ok": "9509",
        "ko": "10172"
    },
    "meanResponseTime": {
        "total": "6214",
        "ok": "5986",
        "ko": "10133"
    },
    "standardDeviation": {
        "total": "2238",
        "ok": "2086",
        "ko": "35"
    },
    "percentiles1": {
        "total": "6248",
        "ok": "6193",
        "ko": "10160"
    },
    "percentiles2": {
        "total": "7795",
        "ok": "6932",
        "ko": "10165"
    },
    "percentiles3": {
        "total": "10085",
        "ok": "8884",
        "ko": "10169"
    },
    "percentiles4": {
        "total": "10165",
        "ok": "9492",
        "ko": "10171"
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
    "count": 178,
    "percentage": 89
},
    "group4": {
    "name": "failed",
    "htmlName": "failed",
    "count": 11,
    "percentage": 6
},
    "meanNumberOfRequestsPerSecond": {
        "total": "1.527",
        "ok": "1.443",
        "ko": "0.084"
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
