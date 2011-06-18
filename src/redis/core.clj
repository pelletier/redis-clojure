(ns redis.core
  (:refer-clojure :exclude [keys type get set sort])
  (:require [clojure.contrib.ns-utils :only (immigrate) :as contrib]))

;; Immigrate commands
(contrib/immigrate 'redis.commands)
