var stats = {
    type: "GROUP",
name: "All Requests",
path: "",
pathFormatted: "group_missing-name-b06d1",
stats: {
    "name": "All Requests",
    "numberOfRequests": {
        "total": "500",
        "ok": "421",
        "ko": "79"
    },
    "minResponseTime": {
        "total": "374",
        "ok": "374",
        "ko": "10099"
    },
    "maxResponseTime": {
        "total": "10404",
        "ok": "10116",
        "ko": "10404"
    },
    "meanResponseTime": {
        "total": "7814",
        "ok": "7347",
        "ko": "10302"
    },
    "standardDeviation": {
        "total": "2186",
        "ok": "2072",
        "ko": "100"
    },
    "percentiles1": {
        "total": "8406",
        "ok": "7793",
        "ko": "10327"
    },
    "percentiles2": {
        "total": "9492",
        "ok": "8805",
        "ko": "10388"
    },
    "percentiles3": {
        "total": "10377",
        "ok": "9715",
        "ko": "10402"
    },
    "percentiles4": {
        "total": "10401",
        "ok": "9893",
        "ko": "10404"
    },
    "group1": {
    "name": "t < 800 ms",
    "htmlName": "t < 800 ms",
    "count": 11,
    "percentage": 2
},
    "group2": {
    "name": "800 ms <= t < 1200 ms",
    "htmlName": "t >= 800 ms <br> t < 1200 ms",
    "count": 1,
    "percentage": 0
},
    "group3": {
    "name": "t >= 1200 ms",
    "htmlName": "t >= 1200 ms",
    "count": 409,
    "percentage": 82
},
    "group4": {
    "name": "failed",
    "htmlName": "failed",
    "count": 79,
    "percentage": 16
},
    "meanNumberOfRequestsPerSecond": {
        "total": "3.817",
        "ok": "3.214",
        "ko": "0.603"
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
        "ok": "421",
        "ko": "79"
    },
    "minResponseTime": {
        "total": "374",
        "ok": "374",
        "ko": "10099"
    },
    "maxResponseTime": {
        "total": "10404",
        "ok": "10116",
        "ko": "10404"
    },
    "meanResponseTime": {
        "total": "7814",
        "ok": "7347",
        "ko": "10302"
    },
    "standardDeviation": {
        "total": "2186",
        "ok": "2072",
        "ko": "100"
    },
    "percentiles1": {
        "total": "8406",
        "ok": "7793",
        "ko": "10327"
    },
    "percentiles2": {
        "total": "9492",
        "ok": "8805",
        "ko": "10388"
    },
    "percentiles3": {
        "total": "10377",
        "ok": "9715",
        "ko": "10402"
    },
    "percentiles4": {
        "total": "10401",
        "ok": "9893",
        "ko": "10404"
    },
    "group1": {
    "name": "t < 800 ms",
    "htmlName": "t < 800 ms",
    "count": 11,
    "percentage": 2
},
    "group2": {
    "name": "800 ms <= t < 1200 ms",
    "htmlName": "t >= 800 ms <br> t < 1200 ms",
    "count": 1,
    "percentage": 0
},
    "group3": {
    "name": "t >= 1200 ms",
    "htmlName": "t >= 1200 ms",
    "count": 409,
    "percentage": 82
},
    "group4": {
    "name": "failed",
    "htmlName": "failed",
    "count": 79,
    "percentage": 16
},
    "meanNumberOfRequestsPerSecond": {
        "total": "3.817",
        "ok": "3.214",
        "ko": "0.603"
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
