(ns ^:figwheel-hooks hello-world.app)

(defn ^:after-load re-render []
      (js/console.log "Hello, World... again"))

(js/console.log "Hello, World!")

;(def elements (.. js/document (getElementsByTagName "p")))

;(js/console.log elements)
