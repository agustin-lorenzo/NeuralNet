package src;
public class Layer {

    int numNodesIn, numNodesOut;
    double[][] weights;
    double[] biases;

    public Layer(int numNodesIn, int numNodesOut) {
        this.numNodesIn = numNodesIn;
        this.numNodesOut = numNodesOut;

        weights = new double[numNodesIn][numNodesOut];
        biases = new double[numNodesOut];
    } // Layer

    public double[] calculateOutputs(double[] inputs) {
        double[] nodeValues = new double[numNodesOut];

        for (int nodeOut = 0; nodeOut < numNodesOut; nodeOut++) {
            double nodeValue = biases[nodeOut];
            for (int nodeIn = 0; nodeIn < numNodesIn; nodeIn++) {
                nodeValue += inputs[nodeIn] * weights[nodeIn][nodeOut];
            }
            nodeValues[nodeOut] = nodeValue;
        }

        return nodeValues;
    } // calculateOutputs

}