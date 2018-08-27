
var Board = React.createClass({

    getInitialState: function () {
        return {
            // pNum: null,
            // pName: null,
            // pStartDate: null,
            // pEndDate: null
            project: []
        }
    },

    yap: function () {
        var self = this;
        axios.get('projectList')
            .then(function (response) {
                console.log(typeof (response))
                var temp = self.state.project
                if (self.state.project != response.data) {
                    for (var i = 0; i < response.data.length; i++) {
                        temp.push(response.data[i])
                    }
                    self.setState({ project: temp })
                }

            })

    },
      
    babo: function (pro, i) {
        return (
            <div key={i}>
                프로젝트 번호 : {pro.pNum}<br></br>
                프로젝트 이름 : {pro.pName}<br></br>
                프로젝트 시작 : {pro.pStartDate}<br></br>
                프로젝트 종료 : {pro.pEndDate}<br></br>
            </div>
        )
    },

    render: function () {
        console.log(this.state.project)
        return (
            <div>
                {this.state.project.map(this.babo)}
                <button onClick={this.yap}>이얍!</button>
            </div>
        )
    }
})


ReactDOM.render(<Board />, document.getElementById('root'))