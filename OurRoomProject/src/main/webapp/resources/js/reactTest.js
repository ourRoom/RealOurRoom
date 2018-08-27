


var data = [
    {author: "Pete Hunt", text: "This is one comment"},
    {author: "Jordan Walke", text: "This is *another* comment"}
  ];

  var CommentBox = React.createClass({
    render: function() {
      return (
        <div className="commentBox">
          <h1>Comments</h1>
          <CommentList {...this.props} />
          <CommentForm />
        </div>
      );
    }
  });

  var CommentList = React.createClass({
    render: function() {
      var comments = this.props.data.map(function(comment, index){
        return <Comment author={comment.author} key={index}>{comment.text}</Comment>
      }.bind(this));

      return (
        <div className="commentList">
          {comments}
        </div>
      );
    }
  });

var CommentForm = React.createClass({
  render: function() {
    return (
      <div className="commentForm">
        <form className="commentForm">
          <input type="text" placeholder="Your name" ref="author"/>
          <input type="text" placeholder="Say something..." ref="text"/>
          <input type="submit" value="Post" />
        </form>
      </div>
    );
  }
});

  var Comment = React.createClass({
    render: function() {
      return (
        <div className="comment">
          <h2 className="commentAuthor">
            {this.props.author}
          </h2>
          {this.props.children}
        </div>
      );
    }
  });

  ReactDOM.render(
    <CommentBox data={data}/>,1
    document.getElementById('content1')
  );