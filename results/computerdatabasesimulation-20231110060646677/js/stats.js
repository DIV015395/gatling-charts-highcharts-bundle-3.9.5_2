var stats = {
    type: "GROUP",
name: "All Requests",
path: "",
pathFormatted: "group_missing-name-b06d1",
stats: {
    "name": "All Requests",
    "numberOfRequests": {
        "total": "779",
        "ok": "354",
        "ko": "425"
    },
    "minResponseTime": {
        "total": "263",
        "ok": "263",
        "ko": "10048"
    },
    "maxResponseTime": {
        "total": "11394",
        "ok": "11394",
        "ko": "10809"
    },
    "meanResponseTime": {
        "total": "9397",
        "ok": "8240",
        "ko": "10360"
    },
    "standardDeviation": {
        "total": "1927",
        "ok": "2383",
        "ko": "175"
    },
    "percentiles1": {
        "total": "10230",
        "ok": "8578",
        "ko": "10354"
    },
    "percentiles2": {
        "total": "10409",
        "ok": "10155",
        "ko": "10471"
    },
    "percentiles3": {
        "total": "10671",
        "ok": "10623",
        "ko": "10694"
    },
    "percentiles4": {
        "total": "10911",
        "ok": "10927",
        "ko": "10765"
    },
    "group1": {
    "name": "t < 800 ms",
    "htmlName": "t < 800 ms",
    "count": 9,
    "percentage": 1
},
    "group2": {
    "name": "800 ms <= t < 1200 ms",
    "htmlName": "t >= 800 ms <br> t < 1200 ms",
    "count": 2,
    "percentage": 0
},
    "group3": {
    "name": "t >= 1200 ms",
    "htmlName": "t >= 1200 ms",
    "count": 343,
    "percentage": 44
},
    "group4": {
    "name": "failed",
    "htmlName": "failed",
    "count": 425,
    "percentage": 55
},
    "meanNumberOfRequestsPerSecond": {
        "total": "5.902",
        "ok": "2.682",
        "ko": "3.22"
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
        "ok": "354",
        "ko": "425"
    },
    "minResponseTime": {
        "total": "263",
        "ok": "263",
        "ko": "10048"
    },
    "maxResponseTime": {
        "total": "11394",
        "ok": "11394",
        "ko": "10809"
    },
    "meanResponseTime": {
        "total": "9397",
        "ok": "8240",
        "ko": "10360"
    },
    "standardDeviation": {
        "total": "1927",
        "ok": "2383",
        "ko": "175"
    },
    "percentiles1": {
        "total": "10230",
        "ok": "8578",
        "ko": "10354"
    },
    "percentiles2": {
        "total": "10409",
        "ok": "10155",
        "ko": "10471"
    },
    "percentiles3": {
        "total": "10671",
        "ok": "10623",
        "ko": "10694"
    },
    "percentiles4": {
        "total": "10911",
        "ok": "10927",
        "ko": "10765"
    },
    "group1": {
    "name": "t < 800 ms",
    "htmlName": "t < 800 ms",
    "count": 9,
    "percentage": 1
},
    "group2": {
    "name": "800 ms <= t < 1200 ms",
    "htmlName": "t >= 800 ms <br> t < 1200 ms",
    "count": 2,
    "percentage": 0
},
    "group3": {
    "name": "t >= 1200 ms",
    "htmlName": "t >= 1200 ms",
    "count": 343,
    "percentage": 44
},
    "group4": {
    "name": "failed",
    "htmlName": "failed",
    "count": 425,
    "percentage": 55
},
    "meanNumberOfRequestsPerSecond": {
        "total": "5.902",
        "ok": "2.682",
        "ko": "3.22"
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
