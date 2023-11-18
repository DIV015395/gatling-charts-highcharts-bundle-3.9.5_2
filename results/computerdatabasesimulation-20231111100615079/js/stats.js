var stats = {
    type: "GROUP",
name: "All Requests",
path: "",
pathFormatted: "group_missing-name-b06d1",
stats: {
    "name": "All Requests",
    "numberOfRequests": {
        "total": "20",
        "ok": "20",
        "ko": "0"
    },
    "minResponseTime": {
        "total": "192",
        "ok": "192",
        "ko": "-"
    },
    "maxResponseTime": {
        "total": "3453",
        "ok": "3453",
        "ko": "-"
    },
    "meanResponseTime": {
        "total": "1331",
        "ok": "1331",
        "ko": "-"
    },
    "standardDeviation": {
        "total": "1182",
        "ok": "1182",
        "ko": "-"
    },
    "percentiles1": {
        "total": "903",
        "ok": "903",
        "ko": "-"
    },
    "percentiles2": {
        "total": "2410",
        "ok": "2410",
        "ko": "-"
    },
    "percentiles3": {
        "total": "3449",
        "ok": "3449",
        "ko": "-"
    },
    "percentiles4": {
        "total": "3452",
        "ok": "3452",
        "ko": "-"
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
    "count": 10,
    "percentage": 50
},
    "group4": {
    "name": "failed",
    "htmlName": "failed",
    "count": 0,
    "percentage": 0
},
    "meanNumberOfRequestsPerSecond": {
        "total": "0.099",
        "ok": "0.099",
        "ko": "-"
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
        "total": "192",
        "ok": "192",
        "ko": "-"
    },
    "maxResponseTime": {
        "total": "2411",
        "ok": "2411",
        "ko": "-"
    },
    "meanResponseTime": {
        "total": "1319",
        "ok": "1319",
        "ko": "-"
    },
    "standardDeviation": {
        "total": "984",
        "ok": "984",
        "ko": "-"
    },
    "percentiles1": {
        "total": "1397",
        "ok": "1397",
        "ko": "-"
    },
    "percentiles2": {
        "total": "2393",
        "ok": "2393",
        "ko": "-"
    },
    "percentiles3": {
        "total": "2410",
        "ok": "2410",
        "ko": "-"
    },
    "percentiles4": {
        "total": "2411",
        "ok": "2411",
        "ko": "-"
    },
    "group1": {
    "name": "t < 800 ms",
    "htmlName": "t < 800 ms",
    "count": 4,
    "percentage": 40
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
    "count": 6,
    "percentage": 60
},
    "group4": {
    "name": "failed",
    "htmlName": "failed",
    "count": 0,
    "percentage": 0
},
    "meanNumberOfRequestsPerSecond": {
        "total": "0.049",
        "ok": "0.049",
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
        "ok": "10",
        "ko": "0"
    },
    "minResponseTime": {
        "total": "222",
        "ok": "222",
        "ko": "-"
    },
    "maxResponseTime": {
        "total": "3453",
        "ok": "3453",
        "ko": "-"
    },
    "meanResponseTime": {
        "total": "1343",
        "ok": "1343",
        "ko": "-"
    },
    "standardDeviation": {
        "total": "1351",
        "ok": "1351",
        "ko": "-"
    },
    "percentiles1": {
        "total": "332",
        "ok": "332",
        "ko": "-"
    },
    "percentiles2": {
        "total": "2455",
        "ok": "2455",
        "ko": "-"
    },
    "percentiles3": {
        "total": "3451",
        "ok": "3451",
        "ko": "-"
    },
    "percentiles4": {
        "total": "3453",
        "ok": "3453",
        "ko": "-"
    },
    "group1": {
    "name": "t < 800 ms",
    "htmlName": "t < 800 ms",
    "count": 6,
    "percentage": 60
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
    "count": 4,
    "percentage": 40
},
    "group4": {
    "name": "failed",
    "htmlName": "failed",
    "count": 0,
    "percentage": 0
},
    "meanNumberOfRequestsPerSecond": {
        "total": "0.049",
        "ok": "0.049",
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
