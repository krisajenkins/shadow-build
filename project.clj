(defproject thheller/shadow-build "0.1.0"
  :description "cljs compiler"
  :url "https://github.com/thheller/shadow-build"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}

  :dependencies [[org.clojure/clojure "1.5.1"]
                 [aysylu/loom "0.4.1"]]

  :profiles {:dev {:source-paths ["dev"]
                   :dependencies [[org.clojure/tools.namespace "0.2.4"]
                                  [org.clojure/clojurescript "0.0-2138"
                                   :exclusions [org.clojure/google-closure-library]]
                                  [thheller/shadow-client "0.1.1"]]}} 
  
  :source-paths ["src/clj"])
