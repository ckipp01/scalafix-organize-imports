/*
rules = [OrganizeImports]
OrganizeImports {
  groupedImports = Keep
  coalesceToWildcardImportThreshold = 3
}
 */
package fix

import scala.collection.immutable.{Seq, Map, Vector}
import scala.collection.mutable.{Buffer, Seq, Map, Set}
import scala.concurrent.{Lock, Await, Channel => Ch, Future, Promise}
import scala.util.{Either, Random => _, Try, Success, Failure}

object CoalesceImportees
