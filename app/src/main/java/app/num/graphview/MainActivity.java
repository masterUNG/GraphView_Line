package app.num.graphview;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.jjoe64.graphview.GraphView;
import com.jjoe64.graphview.series.DataPoint;
import com.jjoe64.graphview.series.LineGraphSeries;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Line Graph

        GraphView line_graph = (GraphView) findViewById(R.id.graph);
        LineGraphSeries<DataPoint> line_series =
                new LineGraphSeries<DataPoint>(new DataPoint[]{
                        new DataPoint(0, 1),
                        new DataPoint(1, 5),
                        new DataPoint(2, 3),
                        new DataPoint(3, 2),
                        new DataPoint(4, 1),
                        new DataPoint(5, 5),
                        new DataPoint(6, 3),
                        new DataPoint(7, 1),
                        new DataPoint(8, 5),
                        new DataPoint(9, 3),
                        new DataPoint(10, 8)
                });

        LineGraphSeries<DataPoint> line_series2 =
                new LineGraphSeries<DataPoint>(new DataPoint[]{
                        new DataPoint(0, 1),
                        new DataPoint(1, 5),
                        new DataPoint(2, 1),
                        new DataPoint(3, 3),
                        new DataPoint(4, 5),
                        new DataPoint(5, 5),
                        new DataPoint(6, 6),
                        new DataPoint(7, 7),
                        new DataPoint(8, 8),
                        new DataPoint(9, 4),
                        new DataPoint(10, 8)
                });

        line_series.setColor(Color.RED);
        line_series2.setColor(Color.BLUE);


        line_graph.addSeries(line_series);
        line_graph.addSeries(line_series2);

        // set the bound

        // set manual X bounds
        line_graph.getViewport().setXAxisBoundsManual(true);
//        line_graph.getViewport().setMinX(0.5);
//        line_graph.getViewport().setMaxX(3.5);
        line_graph.getViewport().setMinX(0.0);
        line_graph.getViewport().setMaxX(10.0);

        // set manual Y bounds
        line_graph.getViewport().setYAxisBoundsManual(true);
        line_graph.getViewport().setMinY(0.5);
        line_graph.getViewport().setMaxY(8);

        line_graph.getViewport().setScrollable(true);


        // set the dynamically label

        /*line_graph.getGridLabelRenderer().setLabelFormatter(new DefaultLabelFormatter() {
            @Override
            public String formatLabel(double value, boolean isValueX) {
                if (isValueX) {
                    // show normal x values
                    return super.formatLabel(value, isValueX);
                } else {
                    // show currency for y values
                    return super.formatLabel(value, isValueX) + " $";
                }
            }
        });*/

        //set the static label
       /* StaticLabelsFormatter staticLabelsFormatter = new StaticLabelsFormatter(line_graph);
        staticLabelsFormatter.setHorizontalLabels(new String[] {"Jan", "Feb", "March"});
        staticLabelsFormatter.setVerticalLabels(new String[] {"Sun", "Mon", "Tue"});
        line_graph.getGridLabelRenderer().setLabelFormatter(staticLabelsFormatter);*/


        // custom paint to make a dotted line
       /* Paint paint = new Paint();
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(10);
        paint.setPathEffect(new DashPathEffect(new float[]{8, 5}, 0));
        line_series.setCustomPaint(paint);*/


        // set the radius of data point
       /* line_series.setDrawDataPoints(true);
        line_series.setDataPointsRadius(10);*/


        // set the background color below the line
//        line_series.setDrawBackground(true);
//        line_series.setBackgroundColor(Color.BLUE);


        // set the thickness of line
        // line_series.setThickness(20);

    }
}
