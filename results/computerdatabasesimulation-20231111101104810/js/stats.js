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
        "total": "133",
        "ok": "133",
        "ko": "-"
    },
    "maxResponseTime": {
        "total": "4003",
        "ok": "4003",
        "ko": "-"
    },
    "meanResponseTime": {
        "total": "1537",
        "ok": "1537",
        "ko": "-"
    },
    "standardDeviation": {
        "total": "1516",
        "ok": "1516",
        "ko": "-"
    },
    "percentiles1": {
        "total": "600",
        "ok": "600",
        "ko": "-"
    },
    "percentiles2": {
        "total": "2980",
        "ok": "2980",
        "ko": "-"
    },
    "percentiles3": {
        "total": "4002",
        "ok": "4002",
        "ko": "-"
    },
    "percentiles4": {
        "total": "4003",
        "ok": "4003",
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
    "count": 1,
    "percentage": 5
},
    "group3": {
    "name": "t >= 1200 ms",
    "htmlName": "t >= 1200 ms",
    "count": 9,
    "percentage": 45
},
    "group4": {
    "name": "failed",
    "htmlName": "failed",
    "count": 0,
    "percentage": 0
},
    "meanNumberOfRequestsPerSecond": {
        "total": "0.098",
        "ok": "0.098",
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
        "total": "133",
        "ok": "133",
        "ko": "-"
    },
    "maxResponseTime": {
        "total": "3990",
        "ok": "3990",
        "ko": "-"
    },
    "meanResponseTime": {
        "total": "1569",
        "ok": "1569",
        "ko": "-"
    },
    "standardDeviation": {
        "total": "1360",
        "ok": "1360",
        "ko": "-"
    },
    "percentiles1": {
        "total": "1531",
        "ok": "1531",
        "ko": "-"
    },
    "percentiles2": {
        "total": "2738",
        "ok": "2738",
        "ko": "-"
    },
    "percentiles3": {
        "total": "3534",
        "ok": "3534",
        "ko": "-"
    },
    "percentiles4": {
        "total": "3899",
        "ok": "3899",
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
    "count": 1,
    "percentage": 10
},
    "group3": {
    "name": "t >= 1200 ms",
    "htmlName": "t >= 1200 ms",
    "count": 5,
    "percentage": 50
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
        "total": "161",
        "ok": "161",
        "ko": "-"
    },
    "maxResponseTime": {
        "total": "4003",
        "ok": "4003",
        "ko": "-"
    },
    "meanResponseTime": {
        "total": "1504",
        "ok": "1504",
        "ko": "-"
    },
    "standardDeviation": {
        "total": "1657",
        "ok": "1657",
        "ko": "-"
    },
    "percentiles1": {
        "total": "186",
        "ok": "186",
        "ko": "-"
    },
    "percentiles2": {
        "total": "2990",
        "ok": "2990",
        "ko": "-"
    },
    "percentiles3": {
        "total": "4003",
        "ok": "4003",
        "ko": "-"
    },
    "percentiles4": {
        "total": "4003",
        "ok": "4003",
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
