$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("testcase.feature");
formatter.feature({
  "line": 3,
  "name": "Title of your feature",
  "description": "I want to use this template for my feature file",
  "id": "title-of-your-feature",
  "keyword": "Feature",
  "tags": [
    {
      "line": 2,
      "name": "@tag"
    }
  ]
});
formatter.scenarioOutline({
  "line": 7,
  "name": "Title of your scenario",
  "description": "",
  "id": "title-of-your-feature;title-of-your-scenario",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 6,
      "name": "@tag1"
    }
  ]
});
formatter.step({
  "line": 8,
  "name": "I want to write a step with precondition",
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "some other precondition \"testdata\"",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "I complete action",
  "rows": [
    {
      "cells": [
        "FirstName",
        "LastName"
      ],
      "line": 11
    },
    {
      "cells": [
        "roshan",
        "zameer"
      ],
      "line": 12
    },
    {
      "cells": [
        "naseem",
        "banu"
      ],
      "line": 13
    }
  ],
  "keyword": "When "
});
formatter.step({
  "line": 14,
  "name": "some other action \"\u003cData1\u003e\" and \"\u003cData2\u003e\"",
  "keyword": "And "
});
formatter.examples({
  "line": 16,
  "name": "",
  "description": "",
  "id": "title-of-your-feature;title-of-your-scenario;",
  "rows": [
    {
      "cells": [
        "Data1",
        "Data2"
      ],
      "line": 17,
      "id": "title-of-your-feature;title-of-your-scenario;;1"
    },
    {
      "cells": [
        "223",
        "3434"
      ],
      "line": 18,
      "id": "title-of-your-feature;title-of-your-scenario;;2"
    },
    {
      "cells": [
        "3444",
        "655"
      ],
      "line": 19,
      "id": "title-of-your-feature;title-of-your-scenario;;3"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 18,
  "name": "Title of your scenario",
  "description": "",
  "id": "title-of-your-feature;title-of-your-scenario;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 2,
      "name": "@tag"
    },
    {
      "line": 6,
      "name": "@tag1"
    }
  ]
});
formatter.step({
  "line": 8,
  "name": "I want to write a step with precondition",
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "some other precondition \"testdata\"",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "I complete action",
  "rows": [
    {
      "cells": [
        "FirstName",
        "LastName"
      ],
      "line": 11
    },
    {
      "cells": [
        "roshan",
        "zameer"
      ],
      "line": 12
    },
    {
      "cells": [
        "naseem",
        "banu"
      ],
      "line": 13
    }
  ],
  "keyword": "When "
});
formatter.step({
  "line": 14,
  "name": "some other action \"223\" and \"3434\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "And "
});
formatter.match({
  "location": "TestcaseStepDefinition.i_want_to_write_a_step_with_precondition()"
});
formatter.result({
  "duration": 68497585,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "testdata",
      "offset": 25
    }
  ],
  "location": "TestcaseStepDefinition.some_other_precondition(String)"
});
formatter.result({
  "duration": 1440507,
  "status": "passed"
});
formatter.match({
  "location": "TestcaseStepDefinition.i_complete_action(DataTable)"
});
formatter.result({
  "duration": 938022,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "223",
      "offset": 19
    },
    {
      "val": "3434",
      "offset": 29
    }
  ],
  "location": "TestcaseStepDefinition.some_other_action(String,String)"
});
formatter.result({
  "duration": 98171,
  "status": "passed"
});
formatter.scenario({
  "line": 19,
  "name": "Title of your scenario",
  "description": "",
  "id": "title-of-your-feature;title-of-your-scenario;;3",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 2,
      "name": "@tag"
    },
    {
      "line": 6,
      "name": "@tag1"
    }
  ]
});
formatter.step({
  "line": 8,
  "name": "I want to write a step with precondition",
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "some other precondition \"testdata\"",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "I complete action",
  "rows": [
    {
      "cells": [
        "FirstName",
        "LastName"
      ],
      "line": 11
    },
    {
      "cells": [
        "roshan",
        "zameer"
      ],
      "line": 12
    },
    {
      "cells": [
        "naseem",
        "banu"
      ],
      "line": 13
    }
  ],
  "keyword": "When "
});
formatter.step({
  "line": 14,
  "name": "some other action \"3444\" and \"655\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "And "
});
formatter.match({
  "location": "TestcaseStepDefinition.i_want_to_write_a_step_with_precondition()"
});
formatter.result({
  "duration": 44587,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "testdata",
      "offset": 25
    }
  ],
  "location": "TestcaseStepDefinition.some_other_precondition(String)"
});
formatter.result({
  "duration": 65631,
  "status": "passed"
});
formatter.match({
  "location": "TestcaseStepDefinition.i_complete_action(DataTable)"
});
formatter.result({
  "duration": 142365,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "3444",
      "offset": 19
    },
    {
      "val": "655",
      "offset": 30
    }
  ],
  "location": "TestcaseStepDefinition.some_other_action(String,String)"
});
formatter.result({
  "duration": 83235,
  "status": "passed"
});
});