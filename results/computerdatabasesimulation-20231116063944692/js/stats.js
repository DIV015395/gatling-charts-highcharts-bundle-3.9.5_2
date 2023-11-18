var stats = {
    type: "GROUP",
name: "All Requests",
path: "",
pathFormatted: "group_missing-name-b06d1",
stats: {
    "name": "All Requests",
    "numberOfRequests": {
        "total": "50",
        "ok": "29",
        "ko": "21"
    },
    "minResponseTime": {
        "total": "157",
        "ok": "157",
        "ko": "10053"
    },
    "maxResponseTime": {
        "total": "10090",
        "ok": "9274",
        "ko": "10090"
    },
    "meanResponseTime": {
        "total": "7120",
        "ok": "4988",
        "ko": "10065"
    },
    "standardDeviation": {
        "total": "3858",
        "ok": "3852",
        "ko": "9"
    },
    "percentiles1": {
        "total": "9228",
        "ok": "6172",
        "ko": "10063"
    },
    "percentiles2": {
        "total": "10062",
        "ok": "9178",
        "ko": "10072"
    },
    "percentiles3": {
        "total": "10074",
        "ok": "9248",
        "ko": "10078"
    },
    "percentiles4": {
        "total": "10084",
        "ok": "9268",
        "ko": "10088"
    },
    "group1": {
    "name": "t < 800 ms",
    "htmlName": "t < 800 ms",
    "count": 9,
    "percentage": 18
},
    "group2": {
    "name": "800 ms <= t < 1200 ms",
    "htmlName": "t >= 800 ms <br> t < 1200 ms",
    "count": 1,
    "percentage": 2
},
    "group3": {
    "name": "t >= 1200 ms",
    "htmlName": "t >= 1200 ms",
    "count": 19,
    "percentage": 38
},
    "group4": {
    "name": "failed",
    "htmlName": "failed",
    "count": 21,
    "percentage": 42
},
    "meanNumberOfRequestsPerSecond": {
        "total": "0.161",
        "ok": "0.093",
        "ko": "0.068"
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
        "total": "50",
        "ok": "29",
        "ko": "21"
    },
    "minResponseTime": {
        "total": "157",
        "ok": "157",
        "ko": "10053"
    },
    "maxResponseTime": {
        "total": "10090",
        "ok": "9274",
        "ko": "10090"
    },
    "meanResponseTime": {
        "total": "7120",
        "ok": "4988",
        "ko": "10065"
    },
    "standardDeviation": {
        "total": "3858",
        "ok": "3852",
        "ko": "9"
    },
    "percentiles1": {
        "total": "9228",
        "ok": "6172",
        "ko": "10063"
    },
    "percentiles2": {
        "total": "10062",
        "ok": "9178",
        "ko": "10072"
    },
    "percentiles3": {
        "total": "10074",
        "ok": "9248",
        "ko": "10078"
    },
    "percentiles4": {
        "total": "10084",
        "ok": "9268",
        "ko": "10088"
    },
    "group1": {
    "name": "t < 800 ms",
    "htmlName": "t < 800 ms",
    "count": 9,
    "percentage": 18
},
    "group2": {
    "name": "800 ms <= t < 1200 ms",
    "htmlName": "t >= 800 ms <br> t < 1200 ms",
    "count": 1,
    "percentage": 2
},
    "group3": {
    "name": "t >= 1200 ms",
    "htmlName": "t >= 1200 ms",
    "count": 19,
    "percentage": 38
},
    "group4": {
    "name": "failed",
    "htmlName": "failed",
    "count": 21,
    "percentage": 42
},
    "meanNumberOfRequestsPerSecond": {
        "total": "0.161",
        "ok": "0.093",
        "ko": "0.068"
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
