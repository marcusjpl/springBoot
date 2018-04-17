

	var Employee = React.createClass({});
	var EmployeeTable = React.createClass({});


	var Employee = React.createClass({
	  render: function() {
	    return (<div>employee</div>);
	  }
	});
	var EmployeeTable = React.createClass({
	  render: function() {
	    return (<div>employee table</div>);
	  }
	});
	 
	ReactDOM.render(
	  <EmployeeTable />, document.getElementById('root')
	);