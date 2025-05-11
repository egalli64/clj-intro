(ns build
  (:require [clojure.tools.build.api :as b]))

(def lib 'tea-app)
(def class-dir "target/classes")
(def basis (b/create-basis {:project "deps.edn"}))
(def uber-file "target/my-app.jar")

(defn clean [_]
      (b/delete {:path "target"}))

(defn uber [_]
      (clean nil)
      (b/copy-dir {:src-dirs ["src"] :target-dir class-dir})
      (b/compile-clj {:basis     basis
                      :src-dirs  ["src"]
                      :class-dir class-dir})
      (b/uber {:class-dir class-dir
               :uber-file uber-file
               :basis     basis
               ; :main      'living.p1.ch6.a.e7
               ; :main      'getting.p1.ch1.e.e1
               :main      'getting.p1.ch1.e.e2
               }))
