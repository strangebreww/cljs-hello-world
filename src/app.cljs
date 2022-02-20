(ns app)

(js/console.log "Hello, World!")

(def elements (.. js/document (getElementsByTagName "p")))

(js/console.log elements)
