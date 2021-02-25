# Display logs in the form: hashcode, author, committed t time ago, description
git log --pretty=format:"%h - %an, %ar : %s" --graph