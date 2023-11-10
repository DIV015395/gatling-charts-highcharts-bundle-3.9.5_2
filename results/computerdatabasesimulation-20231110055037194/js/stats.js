var stats = {
    type: "GROUP",
name: "All Requests",
path: "",
pathFormatted: "group_missing-name-b06d1",
stats: {
    "name": "All Requests",
    "numberOfRequests": {
        "total": "779",
        "ok": "408",
        "ko": "371"
    },
    "minResponseTime": {
        "total": "691",
        "ok": "691",
        "ko": "10179"
    },
    "maxResponseTime": {
        "total": "11757",
        "ok": "11757",
        "ko": "11290"
    },
    "meanResponseTime": {
        "total": "8924",
        "ok": "7555",
        "ko": "10429"
    },
    "standardDeviation": {
        "total": "2287",
        "ok": "2457",
        "ko": "121"
    },
    "percentiles1": {
        "total": "10280",
        "ok": "8198",
        "ko": "10416"
    },
    "percentiles2": {
        "total": "10448",
        "ok": "9569",
        "ko": "10508"
    },
    "percentiles3": {
        "total": "10703",
        "ok": "10987",
        "ko": "10585"
    },
    "percentiles4": {
        "total": "11231",
        "ok": "11335",
        "ko": "10702"
    },
    "group1": {
    "name": "t < 800 ms",
    "htmlName": "t < 800 ms",
    "count": 10,
    "percentage": 1
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
    "count": 397,
    "percentage": 51
},
    "group4": {
    "name": "failed",
    "htmlName": "failed",
    "count": 371,
    "percentage": 48
},
    "meanNumberOfRequestsPerSecond": {
        "total": "5.902",
        "ok": "3.091",
        "ko": "2.811"
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
        "total": "779",
        "ok": "408",
        "ko": "371"
    },
    "minResponseTime": {
        "total": "691",
        "ok": "691",
        "ko": "10179"
    },
    "maxResponseTime": {
        "total": "11757",
        "ok": "11757",
        "ko": "11290"
    },
    "meanResponseTime": {
        "total": "8924",
        "ok": "7555",
        "ko": "10429"
    },
    "standardDeviation": {
        "total": "2287",
        "ok": "2457",
        "ko": "121"
    },
    "percentiles1": {
        "total": "10280",
        "ok": "8198",
        "ko": "10416"
    },
    "percentiles2": {
        "total": "10448",
        "ok": "9569",
        "ko": "10508"
    },
    "percentiles3": {
        "total": "10703",
        "ok": "10987",
        "ko": "10585"
    },
    "percentiles4": {
        "total": "11231",
        "ok": "11335",
        "ko": "10702"
    },
    "group1": {
    "name": "t < 800 ms",
    "htmlName": "t < 800 ms",
    "count": 10,
    "percentage": 1
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
    "count": 397,
    "percentage": 51
},
    "group4": {
    "name": "failed",
    "htmlName": "failed",
    "count": 371,
    "percentage": 48
},
    "meanNumberOfRequestsPerSecond": {
        "total": "5.902",
        "ok": "3.091",
        "ko": "2.811"
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
