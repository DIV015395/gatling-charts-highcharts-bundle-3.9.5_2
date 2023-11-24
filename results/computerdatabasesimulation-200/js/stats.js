var stats = {
    type: "GROUP",
name: "All Requests",
path: "",
pathFormatted: "group_missing-name-b06d1",
stats: {
    "name": "All Requests",
    "numberOfRequests": {
        "total": "400",
        "ok": "325",
        "ko": "75"
    },
    "minResponseTime": {
        "total": "0",
        "ok": "0",
        "ko": "0"
    },
    "maxResponseTime": {
        "total": "10126",
        "ok": "10070",
        "ko": "10126"
    },
    "meanResponseTime": {
        "total": "3596",
        "ok": "3648",
        "ko": "3372"
    },
    "standardDeviation": {
        "total": "4036",
        "ok": "3845",
        "ko": "4769"
    },
    "percentiles1": {
        "total": "173",
        "ok": "1713",
        "ko": "0"
    },
    "percentiles2": {
        "total": "7374",
        "ok": "7305",
        "ko": "10109"
    },
    "percentiles3": {
        "total": "10108",
        "ok": "9736",
        "ko": "10125"
    },
    "percentiles4": {
        "total": "10125",
        "ok": "9905",
        "ko": "10125"
    },
    "group1": {
    "name": "t < 800 ms",
    "htmlName": "t < 800 ms",
    "count": 161,
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
    "count": 164,
    "percentage": 41
},
    "group4": {
    "name": "failed",
    "htmlName": "failed",
    "count": 75,
    "percentage": 19
},
    "meanNumberOfRequestsPerSecond": {
        "total": "15.385",
        "ok": "12.5",
        "ko": "2.885"
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
        "ok": "175",
        "ko": "25"
    },
    "minResponseTime": {
        "total": "231",
        "ok": "231",
        "ko": "10100"
    },
    "maxResponseTime": {
        "total": "10126",
        "ok": "10070",
        "ko": "10126"
    },
    "meanResponseTime": {
        "total": "7192",
        "ok": "6774",
        "ko": "10116"
    },
    "standardDeviation": {
        "total": "2592",
        "ok": "2506",
        "ko": "8"
    },
    "percentiles1": {
        "total": "7375",
        "ok": "7245",
        "ko": "10117"
    },
    "percentiles2": {
        "total": "9659",
        "ok": "8627",
        "ko": "10124"
    },
    "percentiles3": {
        "total": "10118",
        "ok": "9805",
        "ko": "10125"
    },
    "percentiles4": {
        "total": "10125",
        "ok": "9949",
        "ko": "10126"
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
    "count": 164,
    "percentage": 82
},
    "group4": {
    "name": "failed",
    "htmlName": "failed",
    "count": 25,
    "percentage": 13
},
    "meanNumberOfRequestsPerSecond": {
        "total": "7.692",
        "ok": "6.731",
        "ko": "0.962"
    }
}
    },"req_send-request-ty-e20e2": {
        type: "REQUEST",
        name: "Send Request type in Websocket",
path: "Send Request type in Websocket",
pathFormatted: "req_send-request-ty-e20e2",
stats: {
    "name": "Send Request type in Websocket",
    "numberOfRequests": {
        "total": "200",
        "ok": "150",
        "ko": "50"
    },
    "minResponseTime": {
        "total": "0",
        "ok": "0",
        "ko": "0"
    },
    "maxResponseTime": {
        "total": "0",
        "ok": "0",
        "ko": "0"
    },
    "meanResponseTime": {
        "total": "0",
        "ok": "0",
        "ko": "0"
    },
    "standardDeviation": {
        "total": "0",
        "ok": "0",
        "ko": "0"
    },
    "percentiles1": {
        "total": "0",
        "ok": "0",
        "ko": "0"
    },
    "percentiles2": {
        "total": "0",
        "ok": "0",
        "ko": "0"
    },
    "percentiles3": {
        "total": "0",
        "ok": "0",
        "ko": "0"
    },
    "percentiles4": {
        "total": "0",
        "ok": "0",
        "ko": "0"
    },
    "group1": {
    "name": "t < 800 ms",
    "htmlName": "t < 800 ms",
    "count": 150,
    "percentage": 75
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
    "percentage": 25
},
    "meanNumberOfRequestsPerSecond": {
        "total": "7.692",
        "ok": "5.769",
        "ko": "1.923"
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
