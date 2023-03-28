def getChangeSetDetails() {
  def changeSet = currentBuild.rawBuild.changeSets[0]
  def commitMessages = changeSet.items.collect { it.msg }
  def affectedPaths = changeSet.items.collectMany { it.affectedPaths }
  def authorNames = changeSet.items.collect { it.authorFullName }
  
  def changeSetDetails = "Commit Messages: ${commitMessages}\nAffected Paths: ${affectedPaths}\nAuthor Names: ${authorNames}"
  
  return changeSetDetails
}