(ns ui.highlightjs
  (:require
   ["highlight.js/lib/core" :as hljs]
   ["highlight.js/lib/languages/clojure" :as clojure]
   ["highlight.js/lib/languages/clojure-repl" :as clojure-repl]
   ;["highlight.js/lib/languages/javascript" :as javascript]
   ;["highlight.js/lib/languages/markdown" :as markdown]
   ;["highlight.js/lib/languages/plaintext" :as plaintext]
   ;["highlightjs-line-numbers.js/dist/highlightjs-line-numbers.min.js" :as hlln]
   ))

(.registerLanguage hljs "clojure" clojure)
(.registerLanguage hljs "clojure-repl" clojure-repl)

;(.registerLanguage hljs "javascript" javascript)
;(.registerLanguage hljs "markdown" markdown)
;(.registerLanguage hljs "plaintext" plaintext)

;; todo https://github.com/baskeboler/cljs-karaoke-client/blob/master/package.json
;;  "react-highlight.js": "^1.0.7",

;(.initHighlightingOnLoad hljs)

(defn highlightjs [code]
  [:pre.clojure
   [:code {:class "clojure"
           ;:ref #(when % (.highlightBlock hljs %))
           :ref #(when % (.highlightElement hljs %))}
    ;.w-full.font-mono
    ;[:p
    code
    ; ]
    ]])

