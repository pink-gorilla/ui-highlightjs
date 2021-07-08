# ui-highlightjs [![GitHub Actions status |pink-gorilla/ui-highlightjsmirror](https://github.com/pink-gorilla/ui-highlightjs/workflows/CI/badge.svg)](https://github.com/pink-gorilla/ui-highlightjs/actions?workflow=CI)[![Clojars Project](https://img.shields.io/clojars/v/org.pinkgorilla/ui-highlightjs.svg)](https://clojars.org/org.pinkgorilla/ui-highlightjs)

Code Viewer:
- [Highlight.js](https://highlightjs.org/) syntax highlighter.

## End-Users
- this project is NOT for you! Instead go to:
- [notebook](https://github.com/pink-gorilla/notebook)

 
## Demo

```
clojure -X:goldly
```

Navigate your webbrowser to port. 
Codemirror snippets are in `running systems` / `snippet-registry`

## Use with [goldly](https://github.com/pink-gorilla/goldly)

This library provides the pinkie ui renderer [:p/codemirror id atom path]


Add this alias to your deps.edn:

```
 :goldly
  {:extra-deps {org.pinkgorilla/goldly {:mvn/version "0.2.39"}
                org.pinkgorilla/ui-highlightjs {:mvn/version "0.0.3"}}
   :exec-fn goldly-server.app/goldly-server-run!
   :exec-args {:profile "watch"
               :config {:goldly {}}}}
```


## Use outside of goldly and webly

- We use on goldly and webly to manage css and for snippet examples.
- You can create a custom clojurescript project with shadow-cljs 
  and ignore `src/goldly`.