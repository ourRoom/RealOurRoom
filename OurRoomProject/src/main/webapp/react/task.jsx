import React from 'react';

var List = React.createClass({
    add: function () {

    },
      render: function () {
        return (
          <div className='inline'>
            <h1>
            {this.props.children}
            </h1>
            <button>add</button>
          </div>
        )
      }
  })

  var Board = React.createClass({
    getInitialState: function () {
      return {
        step:[
          'ideas',
          'to do',
          'doing',
          'done',
          'review'
        ]
      }
    },

    eachList: function (step, i) {
      return (
        <List key={i} index={i}>
          {step}
          <br/>
          <button>issue</button>
        </List>
      )
    },

    render: function () {
      return(
        <div>
          {
            this.state.step.map(this.eachList)
          }

        </div>
      )
    }
  })

  ReactDOM.render(<Board/>, document.getElementById('container'))

