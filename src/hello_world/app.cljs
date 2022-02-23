(ns ^:figwheel-hooks hello-world.app
  (:require [axios]
            [react]
            [react-dom]))

(def e react/createElement)

(def hello-world (e "h1" nil "Hello, world"))

(def dom-container (.. js/document (querySelector "#hello_world_container")))

(react-dom/render hello-world dom-container)

;(-> (.. axios (get "https://jsonplaceholder.typicode.com/todos/1"))
;    (.then #(js/console.log %)))
;
;(defn ^:after-load re-render []
;  (js/console.log "Hello, World... again"))
;
;(js/console.log "Hello, World!")

;(def elements (.. js/document (getElementsByTagName "p")))

;(js/console.log elements)
