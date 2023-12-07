var stats = {
    type: "GROUP",
name: "All Requests",
path: "",
pathFormatted: "group_missing-name-b06d1",
stats: {
    "name": "All Requests",
    "numberOfRequests": {
        "total": "100",
        "ok": "100",
        "ko": "0"
    },
    "minResponseTime": {
        "total": "320",
        "ok": "320",
        "ko": "-"
    },
    "maxResponseTime": {
        "total": "1963",
        "ok": "1963",
        "ko": "-"
    },
    "meanResponseTime": {
        "total": "1226",
        "ok": "1226",
        "ko": "-"
    },
    "standardDeviation": {
        "total": "512",
        "ok": "512",
        "ko": "-"
    },
    "percentiles1": {
        "total": "1254",
        "ok": "1254",
        "ko": "-"
    },
    "percentiles2": {
        "total": "1673",
        "ok": "1673",
        "ko": "-"
    },
    "percentiles3": {
        "total": "1938",
        "ok": "1938",
        "ko": "-"
    },
    "percentiles4": {
        "total": "1957",
        "ok": "1957",
        "ko": "-"
    },
    "group1": {
    "name": "t < 800 ms",
    "htmlName": "t < 800 ms",
    "count": 26,
    "percentage": 26
},
    "group2": {
    "name": "800 ms <= t < 1200 ms",
    "htmlName": "t >= 800 ms <br> t < 1200 ms",
    "count": 17,
    "percentage": 17
},
    "group3": {
    "name": "t >= 1200 ms",
    "htmlName": "t >= 1200 ms",
    "count": 57,
    "percentage": 57
},
    "group4": {
    "name": "failed",
    "htmlName": "failed",
    "count": 0,
    "percentage": 0
},
    "meanNumberOfRequestsPerSecond": {
        "total": "33.333",
        "ok": "33.333",
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
        "total": "100",
        "ok": "100",
        "ko": "0"
    },
    "minResponseTime": {
        "total": "320",
        "ok": "320",
        "ko": "-"
    },
    "maxResponseTime": {
        "total": "1963",
        "ok": "1963",
        "ko": "-"
    },
    "meanResponseTime": {
        "total": "1226",
        "ok": "1226",
        "ko": "-"
    },
    "standardDeviation": {
        "total": "512",
        "ok": "512",
        "ko": "-"
    },
    "percentiles1": {
        "total": "1254",
        "ok": "1254",
        "ko": "-"
    },
    "percentiles2": {
        "total": "1673",
        "ok": "1673",
        "ko": "-"
    },
    "percentiles3": {
        "total": "1938",
        "ok": "1938",
        "ko": "-"
    },
    "percentiles4": {
        "total": "1957",
        "ok": "1957",
        "ko": "-"
    },
    "group1": {
    "name": "t < 800 ms",
    "htmlName": "t < 800 ms",
    "count": 26,
    "percentage": 26
},
    "group2": {
    "name": "800 ms <= t < 1200 ms",
    "htmlName": "t >= 800 ms <br> t < 1200 ms",
    "count": 17,
    "percentage": 17
},
    "group3": {
    "name": "t >= 1200 ms",
    "htmlName": "t >= 1200 ms",
    "count": 57,
    "percentage": 57
},
    "group4": {
    "name": "failed",
    "htmlName": "failed",
    "count": 0,
    "percentage": 0
},
    "meanNumberOfRequestsPerSecond": {
        "total": "33.333",
        "ok": "33.333",
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
