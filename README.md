# ui-highlightjs [![GitHub Actions status |pink-gorilla/ui-highlightjsmirror](https://github.com/pink-gorilla/ui-highlightjs/workflows/CI/badge.svg)](https://github.com/pink-gorilla/ui-highlightjs/actions?workflow=CI)[![Clojars Project](https://img.shields.io/clojars/v/org.pinkgorilla/ui-highlightjs.svg)](https://clojars.org/org.pinkgorilla/ui-highlightjs)

[Highlight.js](https://highlightjs.org/) code syntax highlighter:

## End-Users
- this project is NOT for you! Instead go to:
- [goldly](https://github.com/pink-gorilla/goldly)
 
## Demo

```
clojure -X:goldly-run
```

Navigate your webbrowser to port 8080. 


## build your own bundle (for testing):


```
clj -X:goldly-build :profile '"npm-install"'
clj -X:goldly-build :profile '"compile2"'
clojure -X:goldly-run
```