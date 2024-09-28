import * as d3 from 'd3';
import { useEffect } from 'react';

const MyChart = () => {
  useEffect(() => {
    const svg = d3.select('#chart')
      .append('svg')
      .attr('width', 500)
      .attr('height', 300);

    svg.append('circle')
      .attr('cx', 150)
      .attr('cy', 150)
      .attr('r', 100)
      .attr('fill', 'blue');
  }, []);

  return <div id="chart"></div>;
};

export default MyChart;
