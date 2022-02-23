(ns ^:figwheel-hooks hello-world.app
  (:require [axios]))

(-> (.. axios (get "https://jsonplaceholder.typicode.com/todos/1"))
    (.then #(js/console.log %)))

(defn ^:after-load re-render []
  (js/console.log "Hello, World... again"))

(js/console.log "Hello, World!")

;(def elements (.. js/document (getElementsByTagName "p")))

;(js/console.log elements)
