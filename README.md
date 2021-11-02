# ui-highlightjs [![GitHub Actions status |pink-gorilla/ui-highlightjsmirror](https://github.com/pink-gorilla/ui-highlightjs/workflows/CI/badge.svg)](https://github.com/pink-gorilla/ui-highlightjs/actions?workflow=CI)[![Clojars Project](https://img.shields.io/clojars/v/org.pinkgorilla/ui-highlightjs.svg)](https://clojars.org/org.pinkgorilla/ui-highlightjs)

[Highlight.js](https://highlightjs.org/) code syntax highlighter:

## End-Users
- this project is NOT for you! Instead go to:
- [goldly](https://github.com/pink-gorilla/goldly)
 
## Demo

```
clojure -X:goldly
```

Navigate your webbrowser to port 8000. 


## Use with [goldly](https://github.com/pink-gorilla/goldly)

This library provides the pinkie ui renderer [:p/highlightjs srccode]

Add this alias to your deps.edn:

```
 :goldly
  {:extra-deps {org.pinkgorilla/goldly {:mvn/version "0.2.39"}
                org.pinkgorilla/ui-highlightjs {:mvn/version "0.0.3"}}
   :exec-fn goldly.app/goldly-server-run!
   :exec-args {:profile "watch"
               :config {:goldly {}}}}
```


## Use outside of goldly and webly

- We use on goldly and webly to manage css and for snippet examples.
- You can create a custom clojurescript project with shadow-cljs 
  and ignore `src/demo`.