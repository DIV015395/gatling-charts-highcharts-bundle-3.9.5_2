var stats = {
    type: "GROUP",
name: "All Requests",
path: "",
pathFormatted: "group_missing-name-b06d1",
stats: {
    "name": "All Requests",
    "numberOfRequests": {
        "total": "200",
        "ok": "172",
        "ko": "28"
    },
    "minResponseTime": {
        "total": "250",
        "ok": "250",
        "ko": "10068"
    },
    "maxResponseTime": {
        "total": "10339",
        "ok": "9315",
        "ko": "10339"
    },
    "meanResponseTime": {
        "total": "5526",
        "ok": "4764",
        "ko": "10209"
    },
    "standardDeviation": {
        "total": "3220",
        "ok": "2811",
        "ko": "88"
    },
    "percentiles1": {
        "total": "6268",
        "ok": "6174",
        "ko": "10199"
    },
    "percentiles2": {
        "total": "7473",
        "ok": "7283",
        "ko": "10312"
    },
    "percentiles3": {
        "total": "10220",
        "ok": "7631",
        "ko": "10330"
    },
    "percentiles4": {
        "total": "10329",
        "ok": "8585",
        "ko": "10337"
    },
    "group1": {
    "name": "t < 800 ms",
    "htmlName": "t < 800 ms",
    "count": 21,
    "percentage": 11
},
    "group2": {
    "name": "800 ms <= t < 1200 ms",
    "htmlName": "t >= 800 ms <br> t < 1200 ms",
    "count": 29,
    "percentage": 14
},
    "group3": {
    "name": "t >= 1200 ms",
    "htmlName": "t >= 1200 ms",
    "count": 122,
    "percentage": 61
},
    "group4": {
    "name": "failed",
    "htmlName": "failed",
    "count": 28,
    "percentage": 14
},
    "meanNumberOfRequestsPerSecond": {
        "total": "1.527",
        "ok": "1.313",
        "ko": "0.214"
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
        "ok": "172",
        "ko": "28"
    },
    "minResponseTime": {
        "total": "250",
        "ok": "250",
        "ko": "10068"
    },
    "maxResponseTime": {
        "total": "10339",
        "ok": "9315",
        "ko": "10339"
    },
    "meanResponseTime": {
        "total": "5526",
        "ok": "4764",
        "ko": "10209"
    },
    "standardDeviation": {
        "total": "3220",
        "ok": "2811",
        "ko": "88"
    },
    "percentiles1": {
        "total": "6268",
        "ok": "6174",
        "ko": "10199"
    },
    "percentiles2": {
        "total": "7473",
        "ok": "7283",
        "ko": "10312"
    },
    "percentiles3": {
        "total": "10220",
        "ok": "7631",
        "ko": "10330"
    },
    "percentiles4": {
        "total": "10329",
        "ok": "8585",
        "ko": "10337"
    },
    "group1": {
    "name": "t < 800 ms",
    "htmlName": "t < 800 ms",
    "count": 21,
    "percentage": 11
},
    "group2": {
    "name": "800 ms <= t < 1200 ms",
    "htmlName": "t >= 800 ms <br> t < 1200 ms",
    "count": 29,
    "percentage": 14
},
    "group3": {
    "name": "t >= 1200 ms",
    "htmlName": "t >= 1200 ms",
    "count": 122,
    "percentage": 61
},
    "group4": {
    "name": "failed",
    "htmlName": "failed",
    "count": 28,
    "percentage": 14
},
    "meanNumberOfRequestsPerSecond": {
        "total": "1.527",
        "ok": "1.313",
        "ko": "0.214"
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
