var stats = {
    type: "GROUP",
name: "All Requests",
path: "",
pathFormatted: "group_missing-name-b06d1",
stats: {
    "name": "All Requests",
    "numberOfRequests": {
        "total": "170",
        "ok": "170",
        "ko": "0"
    },
    "minResponseTime": {
        "total": "1054",
        "ok": "1054",
        "ko": "-"
    },
    "maxResponseTime": {
        "total": "4825",
        "ok": "4825",
        "ko": "-"
    },
    "meanResponseTime": {
        "total": "3203",
        "ok": "3203",
        "ko": "-"
    },
    "standardDeviation": {
        "total": "1176",
        "ok": "1176",
        "ko": "-"
    },
    "percentiles1": {
        "total": "3353",
        "ok": "3353",
        "ko": "-"
    },
    "percentiles2": {
        "total": "4193",
        "ok": "4193",
        "ko": "-"
    },
    "percentiles3": {
        "total": "4805",
        "ok": "4805",
        "ko": "-"
    },
    "percentiles4": {
        "total": "4817",
        "ok": "4817",
        "ko": "-"
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
    "count": 10,
    "percentage": 6
},
    "group3": {
    "name": "t >= 1200 ms",
    "htmlName": "t >= 1200 ms",
    "count": 160,
    "percentage": 94
},
    "group4": {
    "name": "failed",
    "htmlName": "failed",
    "count": 0,
    "percentage": 0
},
    "meanNumberOfRequestsPerSecond": {
        "total": "34",
        "ok": "34",
        "ko": "-"
    }
},
contents: {
"req_send-api-reques-82581": {
        type: "REQUEST",
        name: "Send API Request",
path: "Send API Request",
pathFormatted: "req_send-api-reques-82581",
stats: {
    "name": "Send API Request",
    "numberOfRequests": {
        "total": "170",
        "ok": "170",
        "ko": "0"
    },
    "minResponseTime": {
        "total": "1054",
        "ok": "1054",
        "ko": "-"
    },
    "maxResponseTime": {
        "total": "4825",
        "ok": "4825",
        "ko": "-"
    },
    "meanResponseTime": {
        "total": "3203",
        "ok": "3203",
        "ko": "-"
    },
    "standardDeviation": {
        "total": "1176",
        "ok": "1176",
        "ko": "-"
    },
    "percentiles1": {
        "total": "3353",
        "ok": "3353",
        "ko": "-"
    },
    "percentiles2": {
        "total": "4193",
        "ok": "4193",
        "ko": "-"
    },
    "percentiles3": {
        "total": "4805",
        "ok": "4805",
        "ko": "-"
    },
    "percentiles4": {
        "total": "4817",
        "ok": "4817",
        "ko": "-"
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
    "count": 10,
    "percentage": 6
},
    "group3": {
    "name": "t >= 1200 ms",
    "htmlName": "t >= 1200 ms",
    "count": 160,
    "percentage": 94
},
    "group4": {
    "name": "failed",
    "htmlName": "failed",
    "count": 0,
    "percentage": 0
},
    "meanNumberOfRequestsPerSecond": {
        "total": "34",
        "ok": "34",
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
