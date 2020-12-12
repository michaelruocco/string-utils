# Library Template

[![Build](https://github.com/michaelruocco/library-template/workflows/pipeline/badge.svg)](https://github.com/michaelruocco/library-template/actions)
[![codecov](https://codecov.io/gh/michaelruocco/library-template/branch/master/graph/badge.svg?token=FWDNP534O7)](https://codecov.io/gh/michaelruocco/library-template)
[![Codacy Badge](https://app.codacy.com/project/badge/Grade/272889cf707b4dcb90bf451392530794)](https://www.codacy.com/gh/michaelruocco/library-template/dashboard?utm_source=github.com&amp;utm_medium=referral&amp;utm_content=michaelruocco/library-template&amp;utm_campaign=Badge_Grade)
[![BCH compliance](https://bettercodehub.com/edge/badge/michaelruocco/library-template?branch=master)](https://bettercodehub.com/)
[![Quality Gate Status](https://sonarcloud.io/api/project_badges/measure?project=michaelruocco_library-template&metric=alert_status)](https://sonarcloud.io/dashboard?id=michaelruocco_library-template)
[![Technical Debt](https://sonarcloud.io/api/project_badges/measure?project=michaelruocco_library-template&metric=sqale_index)](https://sonarcloud.io/dashboard?id=michaelruocco_library-template)
[![Coverage](https://sonarcloud.io/api/project_badges/measure?project=michaelruocco_library-template&metric=coverage)](https://sonarcloud.io/dashboard?id=michaelruocco_library-template)
[![Lines of Code](https://sonarcloud.io/api/project_badges/measure?project=michaelruocco_library-template&metric=ncloc)](https://sonarcloud.io/dashboard?id=michaelruocco_library-template)
[![Download](https://api.bintray.com/packages/michaelruocco/maven/library-template/images/download.svg)](https://bintray.com/michaelruocco/maven/library-template/_latestVersion)
[![License: MIT](https://img.shields.io/badge/License-MIT-yellow.svg)](https://opensource.org/licenses/MIT)

## Overview

Library containing a collection of string utilities, currently just contains some classes for
doing simple string regex transformations which implement the UnaryOperator interface to allow
dependency inversion and easier testing. There is also a composer function that allows you to
compose multiple functions into a single function if required.

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