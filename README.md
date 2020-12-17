# String Utils

[![Build](https://github.com/michaelruocco/string-utils/workflows/pipeline/badge.svg)](https://github.com/michaelruocco/string-utils/actions)
[![codecov](https://codecov.io/gh/michaelruocco/string-utils/branch/master/graph/badge.svg?token=4Wt2EZBE1Q)](https://codecov.io/gh/michaelruocco/string-utils)
[![Codacy Badge](https://app.codacy.com/project/badge/Grade/b3dd9322297940949d342fc7e07e955a)](https://www.codacy.com/gh/michaelruocco/string-utils/dashboard?utm_source=github.com&amp;utm_medium=referral&amp;utm_content=michaelruocco/string-utils&amp;utm_campaign=Badge_Grade)
[![BCH compliance](https://bettercodehub.com/edge/badge/michaelruocco/string-utils?branch=master)](https://bettercodehub.com/)
[![Quality Gate Status](https://sonarcloud.io/api/project_badges/measure?project=michaelruocco_string-utils&metric=alert_status)](https://sonarcloud.io/dashboard?id=michaelruocco_string-utils)
[![Technical Debt](https://sonarcloud.io/api/project_badges/measure?project=michaelruocco_string-utils&metric=sqale_index)](https://sonarcloud.io/dashboard?id=michaelruocco_string-utils)
[![Coverage](https://sonarcloud.io/api/project_badges/measure?project=michaelruocco_string-utils&metric=coverage)](https://sonarcloud.io/dashboard?id=michaelruocco_string-utils)
[![Lines of Code](https://sonarcloud.io/api/project_badges/measure?project=michaelruocco_string-utils&metric=ncloc)](https://sonarcloud.io/dashboard?id=michaelruocco_string-utils)
[![Download](https://api.bintray.com/packages/michaelruocco/maven/string-utils/images/download.svg)](https://bintray.com/michaelruocco/maven/string-utils/_latestVersion)
[![Maven Central](https://img.shields.io/maven-central/v/com.github.michaelruocco/string-utils.svg?label=Maven%20Central)](https://search.maven.org/search?q=g:%22com.github.michaelruocco%22%20AND%20a:%22string-utils%22)
[![License: MIT](https://img.shields.io/badge/License-MIT-yellow.svg)](https://opensource.org/licenses/MIT)

## Overview

Library containing a collection of string utilities.

It contains classes for doing simple string regex transformations and string masking
that implement  the UnaryOperator interface to allow dependency inversion and easier testing.

There is also a composer function that allows you to compose multiple functions into a single function if required.

## Useful Commands

```gradle
// cleans build directories
// prints currentVersion
// formats code
// builds code
// runs tests
// checks for gradle issues
// checks dependency versions
./gradlew clean currentVersion dependencyUpdates lintGradle spotlessApply build  
```